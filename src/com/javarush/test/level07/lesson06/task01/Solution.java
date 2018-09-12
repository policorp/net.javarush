package com.javarush.test.level07.lesson06.task01;

/* 5 different strings in a list
1. Create a list of strings.
    2. Add 5 different strings to the list.
    3. Display to the screen its size.
    4. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
*/

import java.util.ArrayList;
import java.util.Date;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        ArrayList<String> list = new ArrayList<String>();
        list.add("first: " + new Date().toString());
        list.add("second - " + new Date().toString());
        list.add("third" + new Date().toString());
        list.add("4 " + new Date().toString());
        list.add("finally " + new Date().toString());

        System.out.println(list.size());
        for (String item:list) {
            System.out.println(item);
        }
    }
}
