package com.spring.demo;

public class FootBallCoach implements Coach{

    private WishService wishService;

    public String getDailyWorkOut(){
        return "Kick Practice";
    }

    @Override
    public String dailyWish() {
        return wishService.getDailyWish();
    }
}
