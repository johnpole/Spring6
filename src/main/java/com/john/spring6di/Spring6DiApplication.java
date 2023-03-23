package com.john.spring6di;

import com.john.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring6DiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Spring6DiApplication.class, args);

        MyController myController = context.getBean(MyController.class);

        System.out.println("Inside Main Method!");
        System.out.println(myController.sayHello());

    }

}
