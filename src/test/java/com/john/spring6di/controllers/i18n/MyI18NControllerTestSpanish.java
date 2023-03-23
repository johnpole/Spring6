package com.john.spring6di.controllers.i18n;

import com.john.spring6di.services.GreetingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
@ActiveProfiles("ES")
@SpringBootTest
class MyI18NControllerTestSpanish {
    @Autowired
    private MyI18NController myI18NController;

    @Test
    void sayHello() {
        System.out.println(myI18NController.sayHello());
    }

}