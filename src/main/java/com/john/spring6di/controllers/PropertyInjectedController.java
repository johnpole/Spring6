package com.john.spring6di.controllers;

import com.john.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServicePropertyInjected")
    private GreetingService greetingService;


    public String sayHello(){
       return greetingService.sayGreeting();
    }
}
