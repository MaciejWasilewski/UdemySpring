package com.example.mw.springNoAnnotationsDemo;

import com.example.mw.coach.Coach;
import com.example.mw.coach.SwimCoach;
import com.example.mw.fortune.FortuneService;
import com.example.mw.fortune.SadFortune;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:data.properties")
public class SpringConfig {

    @Bean
    public FortuneService fortuneService()
    {
        return new SadFortune();
    }

    @Bean
    public Coach swimCoach()
    {
        return new SwimCoach(fortuneService());
    }


}
