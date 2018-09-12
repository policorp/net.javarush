package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Class ConsoleReader
Write a class ConsoleReader, which will have 4 static methods:
    - String readString() to read strings from keyboard
    - int readInt() to read numbers from keyboard
    - double readDouble() to read fractional numbers from keyboard
    - void readLn() to wait for pressing enter [use readString()]
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String result = reader.readLine();
        reader.close();
        return result;
    }

    public static int readInt() throws Exception
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int result = Integer.parseInt(reader.readLine());
        reader.close();
        return result;
    }

    public static double readDouble() throws Exception
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double result = Double.parseDouble(reader.readLine());
        reader.close();
        return result;
    }

    public static void readLn() throws Exception
    {
        //add your code here
        ConsoleReader.readString();
    }
}
