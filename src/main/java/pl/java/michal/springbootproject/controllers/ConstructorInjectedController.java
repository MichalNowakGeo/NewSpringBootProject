package pl.java.michal.springbootproject.controllers;

import pl.java.michal.springbootproject.services.GreetingService;

public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String sayHello(){
        return greetingService.sayGreeting();

    }
}
