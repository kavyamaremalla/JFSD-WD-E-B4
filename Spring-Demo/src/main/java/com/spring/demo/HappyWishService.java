package com.spring.demo;

public class HappyWishService implements WishService{
    @Override
    public String getDailyWish() {
        return "All the best, perform well!";
    }
}
