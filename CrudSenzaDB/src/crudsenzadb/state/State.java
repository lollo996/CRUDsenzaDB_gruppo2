package crudsenzadb.state;

import crudsenzadb.event.Event;

public interface State {
    void next(Event e);
}
