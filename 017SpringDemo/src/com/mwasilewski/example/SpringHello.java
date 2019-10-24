package com.mwasilewski.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHello {
    public static void main(String[] args) {
        //load the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        //retrieve beam

        Coach coach = context.getBean("myCricketCoach", Coach.class);
        Coach coach2 = context.getBean("myCricketCoach", Coach.class);
        //call methods on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach==coach2);
        System.out.println(((CricketCoach) coach2).getNoOfInstances());
//        for (int i = 0; i < 100; i++)
//            System.out.println(coach.getDailyFortune());
        System.out.println(((CricketCoach) coach).getEmailAddress());
        System.out.println(((CricketCoach) coach).getTeam());
        //close the context
        context.close();
    }
}
