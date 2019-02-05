package com.travel.travel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(name = "/")
public class ViewController {

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public ModelAndView mainPage() {
        return new ModelAndView("index.html");
    }
}
