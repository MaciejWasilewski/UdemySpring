package com.example.mw.coach;

import com.example.mw.fortune.FortuneService;

public class GolfCoach implements Coach {
    private FortuneService service;

    public GolfCoach(FortuneService service) {
        this.service = service;
    }

    @Override
    public String getDailyworkout() {
        return "golf + "+service.fortune();
    }
}
