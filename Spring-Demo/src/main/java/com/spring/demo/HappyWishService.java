package com.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class HappyWishService implements WishService{
    @Override
    public String getDailyWish() {
        return "All the best, perform well!";
    }
}
