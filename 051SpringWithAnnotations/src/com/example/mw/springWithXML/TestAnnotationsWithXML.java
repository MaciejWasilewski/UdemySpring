package com.example.mw.springWithXML;

import com.example.mw.coach.Coach;
import com.example.mw.coach.TennisCoach;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationsWithXML {
    public static void main(String[] args) {

        try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml")) {

//            Coach coach = context.getBean("thatSillyCoach", Coach.class);
            Coach coach = context.getBean("tennisCoach", Coach.class);


            System.out.println(coach.getDailyworkout());
            System.out.println(((TennisCoach) coach).tellFortune());
           // System.out.println(((TennisCoach) coach).printSomething());
        }
    }
}
