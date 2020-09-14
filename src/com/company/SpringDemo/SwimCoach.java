package com.company.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{
    private FortuneService fortuneService;

    @Autowired
    public void setFortuneService(@Qualifier("fortuneFromFileService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swimming Coach: Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return "SwimmingCoach: "+fortuneService.getFortune();
    }
}
