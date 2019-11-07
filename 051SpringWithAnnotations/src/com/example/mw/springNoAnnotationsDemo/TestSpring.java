package com.example.mw.springNoAnnotationsDemo;

import com.example.mw.coach.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        try(AbstractApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class))
        {
            Coach coach=context.getBean("swimCoach", Coach.class);
            System.out.println(coach.getDailyworkout());
        }
    }
}
