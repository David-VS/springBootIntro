package be.ehb.oefeningintro.controller;

import be.ehb.oefeningintro.model.Evenement;
import be.ehb.oefeningintro.model.EvenementDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;

@Controller
public class EventControllerWithoutREST {

    private final EvenementDAO mEvenementDAO;

    @Autowired
    public EventControllerWithoutREST(EvenementDAO mEvenementDAO) {
        this.mEvenementDAO = mEvenementDAO;
    }

    @RequestMapping(value = "/events", method = RequestMethod.GET)
    @ResponseBody
    public HashSet<Evenement> getAllEvents(){
        return mEvenementDAO.getEvents();
    }
}
