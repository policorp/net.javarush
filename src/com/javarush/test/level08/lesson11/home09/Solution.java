package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Working with date
1. Implement the method isDateOdd(String date) so that it returns true, if the number of days from the beginning of the year is odd, otherwise it returns false.
    2. String date is passed in the format MAY 1 2013

    JANUARY 1 2000 = true
    JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
//        System.out.printf("JANUARY 1 2000 = %b\n", isDateOdd("JANUARY 1 2000"));
//        System.out.printf("JANUARY 2 2020 = %b\n", isDateOdd("JANUARY 2 2020"));
//        System.out.printf("MAY 1 2013 = %b\n", isDateOdd("MAY 1 2013"));
//        isDateOdd("JANUARY 1 2000");
//        isDateOdd("JANUARY 2 2020");
    }

    public static boolean isDateOdd(String date)
    {
        Date parsed = new Date(Date.parse(date));
        Date start = new Date(Date.parse(date));
        start.setMonth(0);
        start.setDate(1);
        long result = (parsed.getTime() - start.getTime())/1000/60/60/24;
        //System.out.println(result);
        //System.out.println(parsed.getHours() + " " +  parsed.getMinutes() + " " + parsed.getSeconds());
        if (result % 2 == 0)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
