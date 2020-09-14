package com.company.SpringDemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    //create array of stings
    private String[] randomFortunes = {
            "You should help someone",
            "Some one will take care of you",
            "What ever rains you will get trough"};

    //create random
    private Random random = new Random();

    @Override
    public String getFortune() {
        int index = random.nextInt(randomFortunes.length);

        return randomFortunes[index];
    }
}
