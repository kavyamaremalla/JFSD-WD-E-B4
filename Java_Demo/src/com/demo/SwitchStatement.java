package com.demo;

import java.time.DayOfWeek;

public class SwitchStatement {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.FRIDAY;
//        String day = inputFromScanner
        int dayOfWeek;

        switch(day){
            case MONDAY :
                dayOfWeek = 1;
                System.out.println("Start of week Monday " + dayOfWeek);
                break;
            case TUESDAY:
                dayOfWeek = 2;
                System.out.println("Tuesday " + dayOfWeek);
                break;
            case WEDNESDAY:
                dayOfWeek = 3;
                System.out.println("WEDNESDAY " + dayOfWeek);
                break;
            case THURSDAY:
                dayOfWeek = 4;
                System.out.println("THURSDAY " + dayOfWeek);
                break;
            case FRIDAY:
                dayOfWeek = 5;
                System.out.println("FRIDAY " + dayOfWeek);
                break;
            case SATURDAY:
                dayOfWeek = 6;
                System.out.println("SATURDAY " + dayOfWeek);
                break;
            case SUNDAY:
                dayOfWeek = 7;
                System.out.println("SUNDAY " + dayOfWeek);
                break;
            default:
                dayOfWeek = 0;
                System.out.println("Please check your input " + dayOfWeek + " Not a day");
                break;
        }
    }
}
