package com.example.mw;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SadFortune implements FortuneService {

    @Override
    public String fortune() {
        return "I am a sad fortune teller.\nYou will be very unlucky.";
    }
}
