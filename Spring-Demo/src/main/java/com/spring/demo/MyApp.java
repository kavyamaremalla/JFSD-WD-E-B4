package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        /*Using Annotations*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);

        CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
        System.out.println(cricketCoach.getDailyWorkOut());
        System.out.println(cricketCoach.getEmail());
        System.out.println(cricketCoach.dailyWish());

        CricketCoach cricketCoach1 = context.getBean("myCricketCoach", CricketCoach.class);

        System.out.println(cricketCoach);
        System.out.println(cricketCoach1);

        context.close();

//        CricketCoach cricketCoach = new CricketCoach();
//
//        CricketCoach cricketCoach1 = new CricketCoach(new HappyWishService()); //constructor injection
//        System.out.println(cricketCoach.getDailyWorkOut());
//
//        //setter injection
//        cricketCoach.setWishService(new HappyWishService());
//        System.out.println(cricketCoach.dailyWish());
//
//        FootBallCoach footBallCoach = new FootBallCoach();
//        System.out.println(footBallCoach.getDailyWorkOut());

//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ConfigurableApplicationContext configurableContext = (ConfigurableApplicationContext) context;
//
//        CricketCoach cricCoach = context.getBean("myCricketCoach", CricketCoach.class);
//        System.out.println(cricCoach.getDailyWorkOut());
//        System.out.println(cricCoach.dailyWish());
//        System.out.println(cricCoach.getEmail());

//        configurableContext.g



//
//        FootBallCoach footBallCoach = context.getBean("myFootBallCoach", FootBallCoach.class);
//        System.out.println(footBallCoach.getDailyWorkOut());

//        Coach coach;
//        Scanner scanner = new Scanner(System.in);
//        if(scanner.next().equals("cricket")){
//            coach = new CricketCoach();
//        }else {
//            coach = new FootBallCoach();
//        }
//
//        System.out.println(coach.getDailyWorkOut());
    }
}
