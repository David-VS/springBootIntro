package be.ehb.oefeningintro.model;

import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class EvenementDAO {

    private HashSet<Evenement> events = new HashSet<>();

    public EvenementDAO() {
        events.add(new Evenement(1, "Bal national", "TD"));
        events.add(new Evenement(2, "de foot bal", "TD"));
    }

    public HashSet<Evenement> getEvents() {
        return events;
    }
}
