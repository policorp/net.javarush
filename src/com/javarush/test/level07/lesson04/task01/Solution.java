package com.javarush.test.level07.lesson04.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Maximum of an array of 20 numbers
1. In the method initializeArray():
    1.1. Create an array of 20 numbers
    1.2. Read from the keyboard 20 numbers and fill the array with them
    2. The method max(int[] array) should find the maximum number of the elements of the array
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {
        //Initialize (create and fill) an array here
        int[] rawArray = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            rawArray[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();
        return rawArray;
    }

    public static int max(int[] array) {
        //Find the max value here
        int rawMax = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (rawMax < array[i])
                rawMax = array[i];
        }
        return rawMax;
    }
}
