package be.ehb.oefeningintro.data;

import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class EventDAO {

    private HashSet<Event> events = new HashSet<>();

    public EventDAO() {
        events.add(new Event(1, "Bal national", "TD"));
        events.add(new Event(2, "de foot bal", "TD"));
    }

    public HashSet<Event> getEvents() {
        return events;
    }

    public Event getEventById(int id){
        for (Event currentElement : this.events) {
            if(currentElement.getId() == id){
                return currentElement;
            }
        }
        return new Event();
    }

    public void saveEvent(Event ev) {
        events.add(ev);
    }
}
