package com.example.mw.springPureJavaDemo;

import com.example.mw.coach.Coach;
import com.example.mw.coach.TennisCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        try(AbstractApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class))
        {
            Coach coach=context.getBean("tennisCoach", TennisCoach.class);
            System.out.println(coach.getDailyworkout());

        }
    }
}
