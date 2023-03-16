package pl.java.michal.springbootproject.controllers;

import pl.java.michal.springbootproject.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
