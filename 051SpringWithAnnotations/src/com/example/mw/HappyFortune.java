package com.example.mw;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneService {

    @Override
    public String fortune() {
        return "I am a happy fortune teller.\nYou will be very happy.";
    }
}
