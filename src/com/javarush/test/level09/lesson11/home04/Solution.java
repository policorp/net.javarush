package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Date converter
Read from the keyboard a date in the format «08/18/2013»
    Display to the screen that date in the form of «AUG 18, 2013».
    Use the objects Date and SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
//        String str = "08/18/2013";
        int day = Integer.parseInt(str.substring(3,5));
        int month = Integer.parseInt(str.substring(0,2));
        int year = Integer.parseInt(str.substring(6,10));
        Date date = new Date(year-1900, month-1, day);
//        date.setYear(year-1900);
//        date.setMonth(month);
//        System.out.println(date.getYear());

        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");

        String newDate = sdf.format(date);
        System.out.println(newDate.toUpperCase());
//        System.out.printf("%d %d %d\n",date.getDay(), date.getMonth(), date.getYear());
        reader.close();
    }
}
