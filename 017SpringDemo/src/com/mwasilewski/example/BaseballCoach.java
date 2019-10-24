package com.mwasilewski.example;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    public BaseballCoach(FortuneService service) {
        this.fortuneService = service;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 min on bat practice.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
