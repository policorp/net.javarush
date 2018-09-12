package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* One large and two small arrays
1. Create an array of 20 numbers.
    2. Read from keyboard 20 numbers and fill the array with them.
    3. Create two arrays of 10 numbers each.
    4. Copy numbers of the large array to two small arrays: the half of the numbers to the first array, the other half to the second one.
    5. Display to the screen the second small array. Each value should be on a new line.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bigArray = new int[20];
        int[] smallArray1 = new int[10];
        int[] smallArray2 = new int[10];
        for (int i = 0; i < 20; i++) {
            bigArray[i] = Integer.parseInt(reader.readLine());
            if (i < 10) {
                smallArray1[i] = bigArray[i];
            }
            else {
                smallArray2[i - 10] = bigArray[i];
                System.out.println(smallArray2[i - 10]);
            }
        }

        reader.close();
    }
}
