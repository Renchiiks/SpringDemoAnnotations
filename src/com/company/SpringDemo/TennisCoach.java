package com.company.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    private FortuneService fortuneService;


    public TennisCoach() {
        System.out.println("TennisCoach: default constructor");
    }

//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "TennisCoach: Practice your backhand volley";
    }

//    @Override
//    public String getDailyFortune() {
//        return null;
//    }

    @Override
    public String getDailyFortune() {
        return "" + fortuneService.getFortune();
    }

    @Autowired
    public void doSomething(FortuneService fortuneService) {
        System.out.println("TennisCoach: doSomething Method");

    }
}
