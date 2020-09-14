package com.company.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FieldDependencyCoach implements Coach {


    @Qualifier("randomFortuneService")
    @Autowired
    private FortuneService fortuneService;

    public FieldDependencyCoach() {
        System.out.println("FieldDependencyCoach: default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "FieldDependencyCoach: Practice field injection";
    }

    @Override
    public String getDailyFortune() {
        return "FieldCoach: " + fortuneService.getFortune();
    }
}
