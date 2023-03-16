package pl.java.michal.springbootproject.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone From Base Service!!!";
    }
}
