package com.javarush.test.level04.lesson06.task02;

/* Maximum of four numbers
Write a program that reads four numbers from keyboard and displays to the screen the maximum of these numbers.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int res = Integer.parseInt(reader.readLine());
        for (int i = 0; i < 3; i++) {
            int buf = Integer.parseInt(reader.readLine());
            if (buf > res)
                res = buf;
        }
        System.out.println(res);
        reader.close();
    }
}
