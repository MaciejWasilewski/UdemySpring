package com.example.mw.coach;

import org.springframework.stereotype.Component;

@Component("usedCoach")
public class BasketballCoach implements Coach {
    @Override
    public String getDailyworkout() {
        return "Basketball training";
    }
}
