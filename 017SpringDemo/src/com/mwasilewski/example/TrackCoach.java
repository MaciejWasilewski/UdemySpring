package com.mwasilewski.example;

public class TrackCoach implements Coach {
    private FortuneService service;


    public TrackCoach(FortuneService service) {
        this.service = service;
    }

    @Override
    public String getDailyWorkout() {
        return "30 min of track practice.";
    }

    @Override
    public String getDailyFortune() {
        return "Track coach: "+service.getFortune();
    }
}
