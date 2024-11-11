package com.advanced;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(zonedDateTime.plusMonths(1));


        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(ZoneId.of("Australia/Darwin"));
        System.out.println(zonedDateTime1);

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        Instant instant = Instant.now();
        System.out.println(instant);


    }
}
