package com.john.spring6di.controllers.env;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EnvironmentControllerTestDev {
    @Autowired
    private EnvironmentController fauxController;

    @Test
    void getConnectionString() {
        System.out.println(fauxController.getConnectionString());
    }
}
