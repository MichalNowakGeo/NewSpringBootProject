package pl.java.michal.springbootproject.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.java.michal.springbootproject.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController((new GreetingServiceImpl()));
    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}