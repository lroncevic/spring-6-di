package com.lukaroncevic.spring6di.controllers;

import com.lukaroncevic.spring6di.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
