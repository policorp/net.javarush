package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Largest and smallest number in an array
Create an array of 20 numbers.
    Fill it with numbers that are read from keyboard.
    Find the largest and smallest number in an array.
    Display to the screen the largest and smallest numbers separated by a space.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum;
        int  minimum;

        //add your code here
        maximum = Integer.MIN_VALUE;
        minimum = Integer.MAX_VALUE;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            int buf = Integer.parseInt(reader.readLine());
            list.add(buf);
            if (maximum < buf)
                maximum = buf;
            if (minimum > buf)
                minimum = buf;
        }
        reader.close();

        System.out.print(maximum + " ");
        System.out.println(minimum);
    }
}
