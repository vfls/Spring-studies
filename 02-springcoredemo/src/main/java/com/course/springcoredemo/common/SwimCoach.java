package com.course.springcoredemo.common;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyworkout() {
        return "Swim 1000 meters as warmup";
    }
}
