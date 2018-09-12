package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-square
Write a program that displays to the screen a square 10x10 of “S” characters. Use “while” loop.
    Don’t separate characters in the same line.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        int n = 10;
        int k = 10;
        while (n > 0) {
            while (k > 0) {
                System.out.print("S");
                k--;
            }
            System.out.println();
            k = 10;
            n--;
        }
    }
}
