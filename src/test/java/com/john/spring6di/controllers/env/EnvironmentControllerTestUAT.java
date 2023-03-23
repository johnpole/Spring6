package com.john.spring6di.controllers.env;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("UAT")
@SpringBootTest
class EnvironmentControllerTestUAT {

    @Autowired
    private EnvironmentController controller;

    @Test
    void getConnectionString() {
        System.out.println(controller.getConnectionString());
    }
}