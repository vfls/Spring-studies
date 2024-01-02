package com.course.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In Consctructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyworkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
