package com.javarush.test.level09.lesson06.task03;

/* Exception when operating with arrays
Catch the exception that occurs when run the code:
    int[] m = new int[2];
    m[8] = 5;
    Display the exception to the screen, specifying its type.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        try
        {
            int[] m = new int[2];
            m[8] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
        //add your code here

    }
}
