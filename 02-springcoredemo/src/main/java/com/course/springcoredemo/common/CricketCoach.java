package com.course.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    public CricketCoach(){
        System.out.println("In Consctructor: "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyworkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
