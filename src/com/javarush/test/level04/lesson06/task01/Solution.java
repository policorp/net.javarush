package com.javarush.test.level04.lesson06.task01;

/* Minimum of two numbers
Write a program that reads two numbers from keyboard and displays to the screen the minimum of these numbers.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        if (n1 < n2)
            System.out.print(n1);
        else
            System.out.println(n2);
        reader.close();
    }
}