package com.john.spring6di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceFromSetterInjection implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello from Setter Injected Greeting Service!";
    }
}
