package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* Learning and practicing algorithms.
Task: Write a program that reads from keyboard 5 numbers and displays them in ascending order.
    Example input:
    3
    2
    15
    6
    17
    Example output:
    2
    3
    6
    15
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\m.polyakov\\Documents\\JavaRushHomeWork\\src\\com\\javarush\\test\\level06\\lesson11\\bonus03\\data.txt"));
        //add your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(list);
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        reader.close();
    }
}
