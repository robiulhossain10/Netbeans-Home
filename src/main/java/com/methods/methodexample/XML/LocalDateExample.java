/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.XML;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1995, 12, 15);
        LocalDate nextWeek = today.plusWeeks(1);
        LocalDate prevMonth = today.minusMonths(1);
        LocalDate prevDay = today.minusDays(1);

        System.out.println("Today       : " + today);
        System.out.println("Birthday    : " + birthday);
        System.out.println("Next Week   : " + nextWeek);
        System.out.println("Last Month  : " + prevMonth);
        System.out.println("Last Day  : " + prevDay);

        // Check if it's a leap year
        System.out.println("Leap Year?  : " + today.isLeapYear());

        // Difference between two dates
        long daysBetween = ChronoUnit.DAYS.between(birthday, today);
        System.out.println("Days Alive  : " + daysBetween);

        // Format Date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        
        String formatted = today.format(formatter);
        System.out.println("Formatted   : " + formatted);

        System.out.println(today.toEpochSecond(LocalTime.MIN, ZoneOffset.UTC));
        
        
        
        LocalDate date = LocalDate.of(2025, 7, 26);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE");

        String dayName = date.format(formatter2);
        System.out.println("Day Name: " + dayName);
        System.out.println("Day Name: " + date.getDayOfWeek());

//        ------------------------------LocalTime------------------------------
        LocalTime now = LocalTime.now();
        LocalTime customTime = LocalTime.of(14, 30, 15); // 2:30:15 PM

        System.out.println("Current Time  : " + now);
        System.out.println("Custom Time   : " + customTime);

        // Add or subtract hours/minutes
        System.out.println("Add 1 Hour    : " + now.plusHours(1));
        System.out.println("Minus 30 Min  : " + now.minusMinutes(30));

        // Get hour/minute/second
        System.out.println("Hour          : " + now.getHour());
        System.out.println("Minute        : " + now.getMinute());
        System.out.println("Second        : " + now.getSecond());
        
        
        
//        ----------------------------------LocalDAteTime---------------------------

        LocalDateTime ldt_now = LocalDateTime.now();
        LocalDateTime custom = LocalDateTime.of(2025, 1, 1, 9, 30);

        System.out.println("Now            : " + ldt_now);
        System.out.println("Custom DateTime: " + custom);

        // Add/Subtract
        System.out.println("Add 2 Days     : " + ldt_now.plusDays(2));
        System.out.println("Minus 3 Hours  : " + ldt_now.minusHours(3));

        // Format DateTime
        DateTimeFormatter ldt_formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String ltd_formatted = ldt_now.format(ldt_formatter);
        System.out.println("Formatted      : " + ltd_formatted);
    }
}
