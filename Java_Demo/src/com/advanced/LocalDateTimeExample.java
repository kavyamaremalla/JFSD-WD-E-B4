package com.advanced;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        LocalTime time = LocalTime.now();

        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date.plus(1, ChronoUnit.WEEKS));
        System.out.println(date.plusMonths(1));
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        System.out.println(dateTime.getMonth());
        System.out.println(dateTime.getYear());

        LocalTime time1 = LocalTime.parse("20:15:30");
        System.out.println(time1);

        System.out.println(LocalTime.of(22,15));

        System.out.println(LocalDate.of(2016, Month.APRIL,25));

        System.out.println(dateTime.withDayOfMonth(10).withYear(2012));


    }
}
