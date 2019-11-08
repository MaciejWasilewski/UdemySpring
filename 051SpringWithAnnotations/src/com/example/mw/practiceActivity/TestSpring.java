package com.example.mw.practiceActivity;

import com.example.mw.coach.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        try(AbstractApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class))
        {
            Coach coach=context.getBean("newCoach", Coach.class);
            System.out.println(coach.getDailyworkout());
        }
    }
}
