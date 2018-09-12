package com.javarush.test.level08.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* Learning and practicing algorithm.
Task: The program should read from the keyboard 20 words and display them in alphabetical order.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\m.polyakov\\Documents\\JavaRushHomeWork\\src\\com\\javarush\\test\\level08\\lesson11\\bonus03\\data.txt"));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }

        reader.readLine();
    }

    public static void sort(String[] array)
    {
        //add your code here
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
            //System.out.println(list.get(i));
        }

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                //
                if (isGreaterThen(list.get(i), list.get(j))) {
                    String buffer = list.get(i);
                    String buffer2 = list.get(j);
                    list.remove(i);
                    list.add(i, buffer2);
                    list.remove(j);
                    list.add(j, buffer);
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
    }

    //String compare method: '?' greater then 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }
}
