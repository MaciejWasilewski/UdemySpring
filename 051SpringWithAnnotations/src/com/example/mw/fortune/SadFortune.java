package com.example.mw.fortune;

import org.springframework.stereotype.Component;

@Component
public class SadFortune implements FortuneService {

    @Override
    public String fortune() {
        return "I am a sad fortune teller.\nYou will be very unlucky.";
    }
}
