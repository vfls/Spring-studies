package com.course.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    public TennisCoach(){
        System.out.println("In Consctructor: "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyworkout() {
        return "Practice your backhand volley";
    }
}
