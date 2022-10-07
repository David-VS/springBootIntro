package be.ehb.oefeningintro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @RequestMapping(value = "/power", method = RequestMethod.POST)
    @ResponseBody
    public double secondPower(@RequestParam("x") double input){
        return Math.pow(input, 2);
    }

}
