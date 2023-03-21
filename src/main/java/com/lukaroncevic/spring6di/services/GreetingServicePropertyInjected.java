package com.lukaroncevic.spring6di.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService{

    public String sayGreeting() {
        return "Friends don't let friends to property injection!";
    }
}
