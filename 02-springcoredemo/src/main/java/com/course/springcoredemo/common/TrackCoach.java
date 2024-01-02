package com.course.springcoredemo.common;


import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    public TrackCoach() {
        System.out.println("In Consctructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyworkout() {
        return "Run a hard 5k";
    }
}
