package com.company.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("TennisCoach: default constructor");
    }

    @Autowired
    public TennisCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    //define my init method
    @PostConstruct
    public void doStartUp(){
        System.out.println("Tennis Coach-> do start up");
    }

    //define my destroy method
    @PreDestroy
    public void doDestroy(){
        System.out.println("Tennis Coach-> do destroy");
    }

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
        return "TennisCoach " + fortuneService.getFortune();
    }

    @Autowired
    public void doSomething(@Qualifier("happyFortuneService") FortuneService fortuneService) {
        System.out.println("TennisCoach: doSomething Method");

    }
}
