package com.advanced;

import java.util.Scanner;

public class SwitchChanges {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter day in a week ");

        String day = scanner.next();

        //Java 12
        int dayNum = switch (day){
            case "Monday" -> 1;
            case "Tuesday" -> 2;
            case "Wednesday" -> 3;
            case "Thursday" -> 4;
            case "Friday" -> 5;
            default -> 0;
        };

        //Java 17
        String ofcVisit = switch (day){
          case "Monday", "Wednesday", "Friday" -> "To Office";
          case "Tuesday", "Thursday" -> "WFH";
            default -> "Please check input";
        };

        int yieldResult = switch (day){
            case "Monday" -> 1;
            case "Tuesday" -> 2;
            case "Wednesday" -> 3;
            case "Thursday" -> 4;
            case "Friday" -> 5;
            default -> {
                System.out.println("Unknown Input, Please check the input");
                yield 0;
            }
        };

        System.out.println(yieldResult);
        System.out.println(ofcVisit);
//        System.out.println(day);
        System.out.println(dayNum);
    }
}
