package be.ehb.oefeningintro.controller;

import be.ehb.oefeningintro.data.Evenement;
import be.ehb.oefeningintro.data.EvenementDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;

@RestController
@RequestMapping("/events")
public class EventController {

    private final EvenementDAO mEvenementDAO;

    @Autowired
    public EventController(EvenementDAO mEvenementDAO) {
        this.mEvenementDAO = mEvenementDAO;
    }

    @GetMapping
    public HashSet<Evenement> getAllEvents(){
        return mEvenementDAO.getEvents();
    }

    @GetMapping("/{id}")
    public Evenement findByID(@PathVariable("id")int id){
        return mEvenementDAO.getEventById(id);
    }

    @PostMapping
    public void newEvent(@RequestParam("id")int id,
                         @RequestParam("naam")String naam,
                         @RequestParam("soort")String soort){
        Evenement ev = new Evenement();
        ev.setId(id);
        ev.setNaam(naam);
        ev.setSoort(soort);
        mEvenementDAO.saveEvent(ev);
    }
}
