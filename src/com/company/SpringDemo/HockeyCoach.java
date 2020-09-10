package com.company.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hockeyCoach")
public class HockeyCoach implements Coach {
    private FortuneService fortuneService;

    public HockeyCoach() {
        System.out.println("HockeyCoach default constructor");
    }

    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("HockeyCoach setter method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Football training for hockey player";
    }

    @Override
    public String getDailyFortune() {
        return "This is your lucky day" + fortuneService.getFortune();
    }

    @Autowired
    public void doSomething(FortuneService fortuneService) {
        System.out.println("TennisCoach: doSomething Method");

    }
}
