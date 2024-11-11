package com.advanced;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class DurationPeriodExample {

    public static void main(String[] args) {
        //Duration
        LocalTime startTime = LocalTime.of(10,0);
        LocalTime endTime = LocalTime.of(12,30);

        Duration duration = Duration.between(startTime, endTime);

        System.out.println(duration);

        //Period Example
        LocalDate startDate = LocalDate.of(1997,6,28);
        LocalDate endDate = LocalDate.of(2024,11,11);

        Period period = Period.between(startDate, endDate);
        System.out.println(period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }

}
