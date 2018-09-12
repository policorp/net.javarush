package com.javarush.test.level04.lesson06.task03;

/* Sort three numbers
Write a program that reads three numbers from keyboard and displays them in descending order.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
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
                if (arr[i] < arr[j]) {
                    int buf = arr[i];
                    arr[i] = arr[j];
                    arr[j] = buf;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.printf("%d ", arr[i]);
        }
        reader.close();
    }
}
