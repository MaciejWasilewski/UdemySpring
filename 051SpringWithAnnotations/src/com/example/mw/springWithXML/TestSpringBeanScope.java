package com.example.mw.springWithXML;

import com.example.mw.coach.Coach;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringBeanScope {
    public static void main(String[] args) {
        try (
                AbstractApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml")) {
            Coach coach = context.getBean("tennisCoach", Coach.class);
            System.out.println(coach.getDailyworkout());
            Coach coach2 = context.getBean("tennisCoach", Coach.class);
            System.out.println(coach2.getDailyworkout());
            System.out.println(coach == coach2);
        }
    }

}
