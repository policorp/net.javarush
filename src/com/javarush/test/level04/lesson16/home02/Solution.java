package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Display an average
Write a program that reads from keyboard three numbers.
    The program should display to the screen the average of these numbers, that is, neither the biggest nor the smallest one.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                //
                if (arr[i] > arr[j]) {
                    int buf = arr[i];
                    arr[i] = arr[j];
                    arr[j] = buf;
                }
            }
        }
        System.out.println(arr[1]);

        reader.close();
    }
}
