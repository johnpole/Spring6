package com.john.spring6di.services;

import org.springframework.stereotype.Service;

@Service("greetingBase")
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hellow Everyone from Base Service!!!";
    }
}
