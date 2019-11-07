package com.example.mw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
public class TennisCoach implements Coach {
    @Autowired
    @Qualifier("sadFortune")
    private FortuneService service;

    //spring will use the constructor that it can autowire. only one such a constructor can exist.
    public TennisCoach() {
    }
//    @Autowired
//    public void setService(FortuneService service) {
//        System.out.println("inside setService.");
//        this.service = service;
//        System.out.println();
//    }
    @Autowired
    @Qualifier("happyFortune")
    public void printSomething(FortuneService service)
    {
        System.out.println("inside printSomething");
        System.out.println(service.fortune());
    }


    public TennisCoach(FortuneService service) {
        this.service = service;
    }



    @Override
    public String getDailyworkout() {
        return "Tennis training";
    }

    public String tellFortune()
    {
        return service.fortune();
    }
}
