package com.S_JVA.badges;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Date {

    public static void main(String[] args) {
        // Current date
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        System.out.println();

        // Current Time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time " + currentTime);
        System.out.println();

        // Current Time and day
        LocalDateTime currentDateAndTime = LocalDateTime.now();
        System.out.println("Current date and time " + currentDateAndTime);
        System.out.println();

        // Storing dates
        LocalDate.of(2015, 12,23);
        // or
        LocalDate.parse("2015-12-23");

        // Finding date of tomorrow using utility classes
        LocalDate Tomorrow = LocalDate.now().plusDays(1);
        System.out.println(Tomorrow);
        System.out.println();

        // Finding the same date on previous month
        LocalDate previousMonthSameDate = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println(previousMonthSameDate);
        System.out.println();

        // Getting the day of week in a stored date
        DayOfWeek dayOfWeek = LocalDate.parse("2015-12-23").getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println();

        // Getting the day of month in a stored date
        int dayOfMonth = LocalDate.parse("2015-12-23").getDayOfMonth();
        System.out.println(dayOfMonth);
        System.out.println();

        // Testing if the date is in the leap year
        boolean isLeapYear = LocalDate.now().isLeapYear();
        System.out.println(isLeapYear);
        System.out.println();

        // Checking if date is before or after
        boolean notBefore = LocalDate.parse("1995-01-20").isBefore(LocalDate.parse("2015-12-21"));
        boolean notAfter = LocalDate.parse("1995-01-20").isAfter(LocalDate.parse("2015-12-21"));
        System.out.println("Before "+ notBefore + " " + " After " + notAfter);
        System.out.println();
    }
}
