package com.audintel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.support.ModelAndViewContainer;

@Controller
public class TravelInfo {



    @RequestMapping("/login")
    public void getTravelDetails1(ModelAndViewContainer mvc){
        mvc.addAttribute("First MVC Program");
        System.out.printf("Server Side Msg");
        mvc.setView("login1");


    }


}
