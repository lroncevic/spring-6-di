package com.lukaroncevic.spring6di.controllers;

import com.lukaroncevic.spring6di.services.EnvironmentService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnv(){
        return "You are in " + environmentService.getEnv() + " Environment";
    }
}
