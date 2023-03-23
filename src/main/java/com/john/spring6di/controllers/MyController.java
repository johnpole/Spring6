package com.john.spring6di.controllers;

import com.john.spring6di.services.GreetingService;
import com.john.spring6di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("Onside Main Controller");

        //return "Hello Everyone!";
        return greetingService.sayGreeting();
    }

}
