package com.example.mw.coach;

import com.example.mw.fortune.FortuneService;

public class SwimCoach implements Coach {
    @Override
    public String getDailyworkout() {
        return "swimming!";
    }

    private FortuneService service;

    public SwimCoach(FortuneService service) {
        this.service = service;
    }
    public String printService()
    {
        return service.fortune();
    }
}
