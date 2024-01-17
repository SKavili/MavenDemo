package org.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TravelInfo {

    @GetMapping("travelInfo")
    public String getTravelDetails(){
        System.out.printf("Travel Controller");

        return "Hello Traveller";
    }
}
