package com.lukaroncevic.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles({"dev", "EN"})
@SpringBootTest
class EnvironmentControllerTest {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void getEnv() {
        System.out.println(environmentController.getEnv());
    }
}