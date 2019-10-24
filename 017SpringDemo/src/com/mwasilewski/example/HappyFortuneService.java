package com.mwasilewski.example;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "super happy!";
    }
}
