package be.ehb.oefeningintro.controller;

import be.ehb.oefeningintro.model.Evenement;
import be.ehb.oefeningintro.model.EvenementDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
