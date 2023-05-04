package be.ehb.oefeningintro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class LuckyController {

    @RequestMapping( method = RequestMethod.GET, value="/lucky")
    @ResponseBody
    public int getLucky(){
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(9)+1;
    }

}
