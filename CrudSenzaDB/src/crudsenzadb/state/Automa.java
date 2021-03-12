/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudsenzadb.state;

import crudsenzadb.UIAutomabile;
import crudsenzadb.event.AddEvent;
import crudsenzadb.event.AnnullaEvent;
import crudsenzadb.event.ConfermaEvent;
import crudsenzadb.event.Event;
import crudsenzadb.event.ModificaEvent;
import crudsenzadb.event.RicercaEvent;
import crudsenzadb.event.RimuoviEvent;
import crudsenzadb.event.SelezionaEvent;

public class Automa implements State {

    private UIAutomabile ui;
    private State stato;

    public Automa(UIAutomabile ui) {
        this.ui = ui;
        ui.vaiStatoRicerca();
        this.stato = new RicercaState();
        
    }

    @Override
    public void next(Event e) {
        System.out.println("Siamo in " + stato);
        System.out.println("Evento: " + e);
        stato.next(e);
        System.out.println("Arrivati in " + stato + "\n");
    }

    public class RicercaState implements State {

        @Override
        public void next(Event e) {
            if (e instanceof AddEvent) {
                ui.vaiStatoAggiungi();
                stato = new AggiungiState();
            } else if (e instanceof SelezionaEvent) {
                ui.vaiStatoVisualizza();
                stato = new VisualizzaState();
            } else if (e instanceof RicercaEvent) {
                ui.vaiStatoRicerca();
            } else {
                System.out.println("evento inatteso!");
            }
        }

    }

    public class AggiungiState implements State {

        @Override
        public void next(Event e) {
            if (e instanceof ConfermaEvent) {
                if (((ConfermaEvent) e).isValido()) {
                    ui.vaiStatoVisualizza();
                    stato = new VisualizzaState();
                }
            } else if (e instanceof AnnullaEvent) {
                ui.vaiStatoRicerca();
                stato = new RicercaState();
            } else {
                System.out.println("evento inatteso!");
            }
        }
    }

    public class RimuoviState implements State {

        @Override
        public void next(Event e) {
            if (e instanceof ConfermaEvent) {
                ui.vaiStatoRicerca();
                stato = new RicercaState();
            } else if (e instanceof AnnullaEvent) {
                ui.vaiStatoVisualizza();
                stato = new VisualizzaState();
            } else {
                System.out.println("evento inatteso!");
            }
        }
    }

    public class VisualizzaState implements State {

        @Override
        public void next(Event e) {
            if (e instanceof ModificaEvent) {
                ui.vaiStatoModifica();
                stato = new ModificaState();
            } else if (e instanceof SelezionaEvent) {
            } else if (e instanceof AddEvent) {
                ui.vaiStatoAggiungi();
                stato = new AggiungiState();
            } else if (e instanceof RimuoviEvent) {
                ui.vaiStatoRimuovi();
                stato = new RimuoviState();
            } else if (e instanceof RicercaEvent) {
                ui.vaiStatoRicerca();
                stato = new RicercaState();
            } else {
                System.out.println("evento inatteso!");
            }
        }
    }

    public class ModificaState implements State {

        @Override
        public void next(Event e) {
            if (e instanceof AnnullaEvent) {
                ui.vaiStatoVisualizza();
                stato = new VisualizzaState();
            } else if (e instanceof ConfermaEvent) {
                ui.vaiStatoVisualizza();
                stato = new VisualizzaState();
            } else {
                System.out.println("evento inatteso!");
            }
        }
    }

}
