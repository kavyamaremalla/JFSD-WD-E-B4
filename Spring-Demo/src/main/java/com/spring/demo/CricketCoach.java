package com.spring.demo;

public class CricketCoach implements Coach {

//    public CricketCoach() {
//    }

    private WishService wishService; //field level injection

    private String email;

    public CricketCoach(WishService wishService) {
        this.wishService = wishService;
    }


    public WishService getWishService() {
        return wishService;
    }

    public void setWishService(WishService wishService) {
        this.wishService = wishService;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDailyWorkOut(){
        return "Batting Practice";
    }

    @Override
    public String dailyWish() {
        return wishService.getDailyWish();
    }
}
