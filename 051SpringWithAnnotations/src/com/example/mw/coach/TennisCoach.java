package com.example.mw.coach;

import com.example.mw.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
@Scope("prototype")
public class TennisCoach implements Coach {
    private static int num =0;
    @Autowired
    @Qualifier("sadFortune")
    private FortuneService service;

    //spring will use the constructor that it can autowire. only one such a constructor can exist.
    public TennisCoach() {
        num++;
        System.out.println("\n\nTennis coach. Instance no. "+ num+"\n\n");
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
//it won't work on java9 and higher
//    @PreDestroy
//    private void atDestroy()
//    {
//        System.out.println("Tennis coach: bye bye!");
//    }
}
