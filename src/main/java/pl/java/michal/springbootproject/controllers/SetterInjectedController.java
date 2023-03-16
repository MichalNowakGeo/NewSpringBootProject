package pl.java.michal.springbootproject.controllers;

import pl.java.michal.springbootproject.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHelo(){
        return greetingService.sayGreeting();
    }
}
