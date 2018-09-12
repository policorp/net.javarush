package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Array of string lists
Create an array whose elements are lists of strings. Fill the array with any data and display them to the screen.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //add your code here
        ArrayList<String>[] array = new ArrayList[10];
        for (int i = 0; i < 10; i++) {
            ArrayList<String> list = new ArrayList<String>();
            for (int j = 0; j < i+5; j++) {
                list.add("number of i = " + i + ", number of j = " + j);
            }
            array[i] = list;
        }
        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}