package com.john.spring6di;

import com.john.spring6di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {
    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    MyController myController;

    @Test
    void testAutoWireOfController() {
        System.out.println(myController.sayHello());
    }

    @Test
    void testControllereFronContext(){
        MyController bean = applicationContext.getBean(MyController.class);
        System.out.println(bean.sayHello());
    }
    @Test
    void contextLoads() {
    }

}
