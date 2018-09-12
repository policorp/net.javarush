package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Learning and practicing algorithm.
Task: Read from the keyboard 20 numbers and display them in descending order.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader reader= new BufferedReader(new FileReader("C:\\Users\\m.polyakov\\Documents\\JavaRushHomeWork\\src\\com\\javarush\\test\\level07\\lesson12\\bonus03\\data"));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(int[] array)
    {
        //add your code here
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int buf = array[i];
                    array[i] = array[j];
                    array[j] = buf;
                }
            }
        }
    }
}
