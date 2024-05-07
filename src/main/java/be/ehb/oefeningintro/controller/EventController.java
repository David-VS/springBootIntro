package be.ehb.oefeningintro.controller;

import be.ehb.oefeningintro.data.Event;
import be.ehb.oefeningintro.data.EventDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;

@RestController
@RequestMapping("/events")
public class EventController {

    private final EventDAO mEventDAO;

    @Autowired
    public EventController(EventDAO mEventDAO) {
        this.mEventDAO = mEventDAO;
    }

    @GetMapping
    public HashSet<Event> getAllEvents(){
        return mEventDAO.getEvents();
    }

    @GetMapping("/{id}")
    public Event findByID(@PathVariable("id")int id){
        return mEventDAO.getEventById(id);
    }

    @PostMapping
    public void newEvent(@RequestParam("id")int id,
                         @RequestParam("name")String name,
                         @RequestParam("type")String sort){
        Event ev = new Event();
        ev.setId(id);
        ev.setName(name);
        ev.setSort(sort);
        mEventDAO.saveEvent(ev);
    }
}
