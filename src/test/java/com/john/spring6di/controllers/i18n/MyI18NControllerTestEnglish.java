package com.john.spring6di.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyI18NControllerTestEnglish {

    @Autowired
    private MyI18NController myI18NController;

    @Test
    void sayHello() {
        System.out.println(myI18NController.sayHello());
    }
}
