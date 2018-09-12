package com.javarush.test.level07.lesson12.home01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Display numbers in reverse order
Read from the keyboard 10 numbers and fill the list with them.
    Display to the screen the numbers in reverse order. Use the loop.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //add your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(9 - i));
        }
        reader.close();
    }
}
