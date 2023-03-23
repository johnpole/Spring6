package com.john.spring6di.controllers;

import com.john.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {



    private GreetingService greetingService;
    @Autowired
    public void setGreetingService(@Qualifier("greetingServiceFromSetterInjection") GreetingService greetingService
    ) {
        System.out.println("SetterInjectedController Inside");
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
