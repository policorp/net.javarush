package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Array of strings in reverse order
1. Create an array of 10 strings.
    2. Read from the keyboard 8 strings and store them in the array.
    3. Display to the screen the contents of the entire array (10 items) in reverse order. Each item should be on a new line.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[10];
        for (int i = 0; i < 8; i++) {
            array[i] = reader.readLine();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(array[9 - i]);
        }
        reader.close();
    }
}