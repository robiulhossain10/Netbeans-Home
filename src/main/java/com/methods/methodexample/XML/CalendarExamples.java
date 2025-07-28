/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.XML;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalendarExamples {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        // Get current time
        System.out.println("Current Date/Time: " + cal.getTime());

        // Get specific fields
        System.out.println("Year: " + cal.get(Calendar.YEAR));
        System.out.println("Month: " + (cal.get(Calendar.MONTH) + 1)); // 0-based
        System.out.println("Day of Month: " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of Week: " + cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Hour (12): " + cal.get(Calendar.HOUR));
        System.out.println("Hour (24): " + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute: " + cal.get(Calendar.MINUTE));
        System.out.println("Second: " + cal.get(Calendar.SECOND));

        // Set specific date
        cal.set(Calendar.YEAR, 2025);
        cal.set(Calendar.MONTH, Calendar.JULY); // or 6
        cal.set(Calendar.DAY_OF_MONTH, 24);
        System.out.println("Updated Date: " + cal.getTime());

        // Add/Subtract
        cal.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("After 5 Days: " + cal.getTime());

        cal.add(Calendar.MONTH, -2);
        System.out.println("2 Months Ago: " + cal.getTime());

        // Roll (changes field without changing larger fields)
        cal.roll(Calendar.DAY_OF_MONTH, 10);
        System.out.println("Roll 10 Days: " + cal.getTime());

        // Check if a field is set
        boolean isSet = cal.isSet(Calendar.MINUTE);
        System.out.println("Is minute set? " + isSet);

        // Clear a field
        cal.clear(Calendar.MINUTE);
        System.out.println("After clearing minute: " + cal.getTime());

        // Get time in millis
        long millis = cal.getTimeInMillis();
        System.out.println("Time in millis: " + millis);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = null;
        
        try {
            birthday = sdf.parse("1971-03-25");
        } catch (ParseException ex) {
            Logger.getLogger(CalendarExamples.class.getName()).log(Level.SEVERE, null, ex);
        }

        Calendar birthCal = Calendar.getInstance();
        birthCal.setTime(birthday);

        // Step 3: Format the date to get the day name
        SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE"); // Full name (e.g., Saturday)

        String dayName = sdf2.format(birthday);
        System.out.println("Day Name: " + dayName);
        System.out.println("Date 1971-03-25: " + birthCal.get(Calendar.DAY_OF_WEEK));
        Calendar today = Calendar.getInstance();

        boolean isBirthday = birthCal.get(Calendar.MONTH) == today.get(Calendar.MONTH)
                && birthCal.get(Calendar.DAY_OF_MONTH) == today.get(Calendar.DAY_OF_MONTH);

        System.out.println("Is today birthday? " + isBirthday);

    }
}
