package com.springboot.SocialLogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/home")
public class HomeController {

    @RequestMapping(value = "/index")
    public ModelAndView index() {
        return new ModelAndView("index");
    }
}
