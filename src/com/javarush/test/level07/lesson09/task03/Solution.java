package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* The word «here»
1. Create a list of the words «stop», «look», «listen».
    2. Add a string containing «here» after each word.
    3. Display the result. Each element of list should be on a new line. Use “for” loop.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        ArrayList<String> list = new ArrayList<String>();
        list.add("stop");
        list.add("look");
        list.add("listen");
        list.add(1, "here");
        list.add(3, "here");
        list.add("here");

        for(String item:list) {
            System.out.println(item);
        }
    }
}
