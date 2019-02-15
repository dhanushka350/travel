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
    @RequestMapping(value = "index2", method = RequestMethod.GET)
    public ModelAndView index2() {
        return new ModelAndView("index2.html");
    }
    @RequestMapping(value = "index3", method = RequestMethod.GET)
    public ModelAndView index3() {
        return new ModelAndView("index3.html");
    }
    @RequestMapping(value = "index4", method = RequestMethod.GET)
    public ModelAndView index4() {
        return new ModelAndView("index4.html");
    }
    @RequestMapping(value = "index5", method = RequestMethod.GET)
    public ModelAndView index5() {
        return new ModelAndView("index5.html");
    }
    @RequestMapping(value = "index6", method = RequestMethod.GET)
    public ModelAndView index6() {
        return new ModelAndView("index6.html");
    }
    @RequestMapping(value = "index7", method = RequestMethod.GET)
    public ModelAndView index7() {
        return new ModelAndView("index7.html");
    }
    @RequestMapping(value = "portfolio", method = RequestMethod.GET)
    public ModelAndView portfolio() {
        return new ModelAndView("portfolio.html");
    }
    @RequestMapping(value = "portfolio2", method = RequestMethod.GET)
    public ModelAndView portfolio2() {
        return new ModelAndView("portfolio2.html");
    }
    @RequestMapping(value = "portfolio3", method = RequestMethod.GET)
    public ModelAndView portfolio3() {
        return new ModelAndView("portfolio3.html");
    }
    @RequestMapping(value = "portfolio4", method = RequestMethod.GET)
    public ModelAndView portfolio4() {
        return new ModelAndView("portfolio4.html");
    }
    @RequestMapping(value = "portfolio5", method = RequestMethod.GET)
    public ModelAndView portfolio5() {
        return new ModelAndView("portfolio5.html");
    }
    @RequestMapping(value = "portfolio6", method = RequestMethod.GET)
    public ModelAndView portfolio6() {
        return new ModelAndView("portfolio6.html");
    }
    @RequestMapping(value = "portfolio-single", method = RequestMethod.GET)
    public ModelAndView portfolio_single() {
        return new ModelAndView("portfolio-single.html");
    }
    @RequestMapping(value = "portfolio-single2", method = RequestMethod.GET)
    public ModelAndView portfolio_single2() {
        return new ModelAndView("portfolio-single2.html");
    }
    @RequestMapping(value = "portfolio-single3", method = RequestMethod.GET)
    public ModelAndView portfolio_single3() {
        return new ModelAndView("portfolio-single3.html");
    }
    @RequestMapping(value = "portfolio-single4", method = RequestMethod.GET)
    public ModelAndView portfolio_single4() {
        return new ModelAndView("portfolio-single4.html");
    }
    @RequestMapping(value = "about", method = RequestMethod.GET)
    public ModelAndView about() {
        return new ModelAndView("about.html");
    }
    @RequestMapping(value = "blog", method = RequestMethod.GET)
    public ModelAndView blog() {
        return new ModelAndView("blog.html");
    }
    @RequestMapping(value = "blog-single", method = RequestMethod.GET)
    public ModelAndView blog_single() {
        return new ModelAndView("blog-single.html");
    }
    @RequestMapping(value = "contacts", method = RequestMethod.GET)
    public ModelAndView contacts() {
        return new ModelAndView("contacts.html");
    }
}
