package com.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class BadWishService implements WishService{
    @Override
    public String getDailyWish() {
        return "May you fail!";
    }
}
