package com.example.mw.coach;

import com.example.mw.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

    @Value("${email}")
    private String email;
    @Value("${team}")
    private String team;

    @Override
    public String getDailyworkout() {
        return "swimming! "+email+" "+team;
    }

    private FortuneService service;

    public SwimCoach(@Qualifier("sadFortune") FortuneService service) {
        this.service = service;
    }
    public String printService()
    {
        return service.fortune();
    }
}
