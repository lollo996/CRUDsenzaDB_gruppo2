/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudsenzadb.state;

import crudsenzadb.event.AddEvent;
import crudsenzadb.event.Event;

public class Automa implements State{
    
    private State stato;

    @Override
    public void next(Event e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public class RicercaState implements State{

        @Override
        public void next(Event e) {
            if(e instanceof AddEvent){}
        }
        
    }
    
    public class AggiungiState implements State{

        @Override
        public void next(Event e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    public class RimuoviState implements State{

        @Override
        public void next(Event e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
     public class VisualizzaState implements State{

        @Override
        public void next(Event e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
     
      public class ModificaState implements State{

        @Override
        public void next(Event e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
     
}
