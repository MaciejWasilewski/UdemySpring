package com.mwasilewski.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHello {
    public static void main(String[] args) {
        //load the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve beam

        Coach coach=context.getBean("myCoach",Coach.class);

        //call methods on the bean
        System.out.println(coach.getDailyWorkout());

        //close the context
        context.close();
    }
}
