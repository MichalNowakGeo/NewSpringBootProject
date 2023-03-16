package pl.java.michal.springbootproject.controllers;

import org.springframework.stereotype.Controller;
import pl.java.michal.springbootproject.services.GreetingService;
import pl.java.michal.springbootproject.services.GreetingServiceImpl;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I'm in th e controller");

        return greetingService.sayGreeting();
    }
}
