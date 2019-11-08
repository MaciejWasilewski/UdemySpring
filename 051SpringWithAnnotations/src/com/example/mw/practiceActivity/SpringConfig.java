package com.example.mw.practiceActivity;

import com.example.mw.coach.Coach;
import com.example.mw.coach.GolfCoach;
import com.example.mw.fortune.SadFortune;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    Coach newCoach()
    {
        return new GolfCoach(new SadFortune());
    }
}
