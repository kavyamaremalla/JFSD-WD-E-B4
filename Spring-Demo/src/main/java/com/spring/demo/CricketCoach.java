package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("myCricketCoach")
//@Scope(value = BeanDefinition.SCOPE_SINGLETON)
@Scope("prototype")
public class CricketCoach implements Coach {

//    public CricketCoach() {
//    }

//    @Autowired
    private WishService wishService; //field level injection

    @Value("${email}")
    private String email;

    @Autowired
    public CricketCoach(@Qualifier("badWishService") WishService wishService) {
        this.wishService = wishService;
    }


    public WishService getWishService() {
        return wishService;
    }

//    @Autowired
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


    @PostConstruct
    public void startUpMethod(){
        System.out.println("Bean Created");
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("Destroyed");
    }
}
