package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Calculate a sum
Write a program that reads from keyboard numbers and calculates their sum.
    If the user enters -1, the program should display the sum and terminate. -1 should be included in sum.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int input = Integer.parseInt(reader.readLine());
        sum += input;
        while (input != -1){
            input = Integer.parseInt(reader.readLine());
            sum += input;
        }
        System.out.println(sum);
        reader.close();
    }
}
