package com.john.spring6di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServicePropertyInjected implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello from Property Injection!!";
    }
}
