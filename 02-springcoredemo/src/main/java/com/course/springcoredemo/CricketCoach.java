package com.course.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyworkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
