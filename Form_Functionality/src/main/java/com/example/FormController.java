package com.example;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class FormController {
    @RequestMapping("/appointment")
    public ModelAndView appointment(){
        Patient patient = new Patient();
        patient.setPatientName("Name");
        patient.setPatientContact(9081153070L);
        ModelAndView m = new ModelAndView("appointment","command",patient);
//        ModelAndView m = new ModelAndView("appointment");
        m.addObject("patient", patient);

        return m;
    }

    @RequestMapping("/addappointment")
    public ModelAndView addappointment(
//            @RequestParam("patientname") String name,
//            @RequestParam("patientcontact") String conatact,
//            @RequestParam Map<String,String> vars)
            @ModelAttribute Patient patient)
    {
        ModelAndView m = new ModelAndView("addappointment","command",patient);
//        m.addObject("msg",String.format("Appointment of %s is Booked.\n We will contact on %d.",vars.get("patientName"),Long.parseLong(vars.get("patientContact"))));
        m.addObject("msg","Appointment Register successfull.");
        return m;
    }

    @RequestMapping("/form")
    public ModelAndView form()
    {
        Customer customer = new Customer();
//        customer.
        return new ModelAndView("form","customer",customer);
    }

    @RequestMapping("/submit")
    public ModelAndView submit(@Valid @ModelAttribute Customer customer, BindingResult bindingResult, Model model)
    {
        if(bindingResult.hasErrors())
        {
            return new ModelAndView("form","customer",customer);
        }
        ModelAndView m = new ModelAndView("submit");
        return m;
    }
}
