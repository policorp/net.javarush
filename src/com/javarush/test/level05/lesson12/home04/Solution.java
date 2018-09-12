package com.javarush.test.level05.lesson12.home04;

/* Display the current date
Display to the screen the current date in a form similar to «21 02 2014».
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {
        //add your code here
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
        System.out.println(sdf.format(date));
    }
}
