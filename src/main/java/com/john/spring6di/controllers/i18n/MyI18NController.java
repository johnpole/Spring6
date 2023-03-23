package com.john.spring6di.controllers.i18n;

import com.john.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyI18NController {
    @Qualifier("i18NService")
    private GreetingService greetingService;

    public MyI18NController( GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
