package com.javarush.test.level09.lesson06.task02;

/* Exception when operating with strings
Catch the exception that occurs when run the code:
    String s = null;
    String m = s.toLowerCase();
    Display the exception to the screen, specifying its type.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        try {
            String s = null;
            String m = s.toLowerCase();
        }
        catch (NullPointerException e) {
            System.out.println(e.toString());
        }
        //add your code here

    }
}
