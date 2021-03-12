/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudsenzadb.state;

import crudsenzadb.CrudSenzaDbUI;
import crudsenzadb.event.AddEvent;
import crudsenzadb.event.Event;
import crudsenzadb.event.SelezionaEvent;

public class Automa implements State {

    private CrudSenzaDbUI ui;
    private State stato;

    public Automa(CrudSenzaDbUI ui) {
        this.ui = ui;
        this.stato = new RicercaState();
    }
    
    

    @Override
    public void next(Event e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public class RicercaState implements State {

        @Override
        public void next(Event e) {
            if (e instanceof AddEvent) {

            } else if (e instanceof SelezionaEvent) {
            }
        }

    }

    public class AggiungiState implements State {

        @Override
        public void next(Event e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    public class RimuoviState implements State {

        @Override
        public void next(Event e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    public class VisualizzaState implements State {

        @Override
        public void next(Event e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    public class ModificaState implements State {

        @Override
        public void next(Event e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
