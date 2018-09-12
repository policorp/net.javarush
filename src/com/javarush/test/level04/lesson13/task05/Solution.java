package com.javarush.test.level04.lesson13.task05;

import java.io.*;

/* Everybody loves somebody
Write a program that reads from keyboard name. Use “for” loop to display 10 times the text:
    «name» loves me.

    Example text:
    Pam loves me.
    Pam loves me.
    …
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s loves me.\n", name);
        }
        reader.close();
    }
}
