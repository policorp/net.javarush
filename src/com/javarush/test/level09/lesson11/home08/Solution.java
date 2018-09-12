package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* List of arrays of numbers
Create a list whose elements are arrays of numbers. Add to the list five object arrays with length 5, 2, 4, 7, 0, respectively.
    Fill arrays with any data and display them on the screen.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //add your code here
        ArrayList<int []> list = new ArrayList<int[]>();

        int[] buffer = new int[5];
        for (int i = 0; i < 5; i++) {
            buffer[i] = i + 45;
        }
        list.add(buffer);

        buffer = new int[2];
        for (int i = 0; i < 2; i++) {
            buffer[i] = i + 5;
        }
        list.add(buffer);

        buffer = new int[4];
        for (int i = 0; i < 4; i++) {
            buffer[i] = i + 78;
        }
        list.add(buffer);

        buffer = new int[7];
        for (int i = 0; i < 7; i++) {
            buffer[i] = i + 78;
        }
        list.add(buffer);

        buffer = new int[0];
        list.add(buffer);

        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
