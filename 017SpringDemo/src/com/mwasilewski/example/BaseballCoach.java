package com.mwasilewski.example;

public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Spend 30 min on bat practice.";
    }
}
