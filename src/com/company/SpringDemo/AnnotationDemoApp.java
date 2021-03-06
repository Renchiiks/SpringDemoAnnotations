package com.company.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        //read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //get bean form spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("hockeyCoach", Coach.class);
        Coach fieldCoach = context.getBean("fieldDependencyCoach", Coach.class);
        Coach swimCoach = context.getBean("swimCoach", Coach.class);

        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(alphaCoach.getDailyWorkout());
        System.out.println(fieldCoach.getDailyWorkout());
        System.out.println(swimCoach.getDailyWorkout());

        //call method to get fortune
        System.out.println(theCoach.getDailyFortune());
        System.out.println(alphaCoach.getDailyFortune());
        System.out.println(fieldCoach.getDailyFortune());
        System.out.println(swimCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
