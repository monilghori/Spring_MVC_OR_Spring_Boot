package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
@RequestMapping("/welcome")
    public ModelAndView welcome(){

        ModelAndView m = new ModelAndView("welcome");
        m.addObject("message" ,"Hello Spring MVC");
        return m;    }
}
