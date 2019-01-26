package com.springboot.SocialLogin.controller;

import com.springboot.SocialLogin.service.HomeService;
import com.springboot.SocialLogin.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/home")
public class HomeController {

    @Autowired
    HomeService homeService;

    @RequestMapping(value = "/index")
    public ModelAndView index() {

        homeService.bootStrap();
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/facebook")
    public ModelAndView facebook() {
        return new ModelAndView("index");
    }
}
