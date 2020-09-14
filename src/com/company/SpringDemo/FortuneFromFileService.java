package com.company.SpringDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Random;

@Component
public class FortuneFromFileService implements FortuneService {

    @Value("${fortunes}")
    private String[] randomFortunes;
    //create random
    private Random random = new Random();

    @Override
    @PostConstruct
    public String getFortune() {
        System.out.println("@Post construct");
        int index = random.nextInt(randomFortunes.length);
        return randomFortunes[index];
    }
}
