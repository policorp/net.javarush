package com.javarush.test.level06.lesson08.task05;

/* Class StringHelper
Write a class StringHelper, which will have 2 static methods:
    - String multiply(String s, int count) should return the string s repeated count times.
    - String multiply(String s) should return the string s repeated 5 times.

    Example:
    Amigo -> AmigoAmigoAmigoAmigoAmigo
*/

public class StringHelper
{
    public static String multiply(String s)
    {
        String result = "";
        //add your code here
        result = new StringBuilder(s).append(s).append(s).append(s).append(s).toString();
        return result;
    }

    public static String multiply(String s, int count)
    {
        String result = "";
        //add your code here
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(s);
        }
        result = sb.toString();
        return result;
    }
}
