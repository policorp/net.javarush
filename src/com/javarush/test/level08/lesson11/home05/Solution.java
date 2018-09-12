package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Stop Look Listen. Now capitalized
Write a program that should read from the keyboard a string.
    The program should replace the first letters of all words in the text with the uppercase.
    Display to the screen the result.

    Example input:
    stop look listen
    Example output:
    Stop Look Listen
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        //add your code here
        StringBuilder sb = new StringBuilder();
        char lastC = ' ';
        for (int i = 0; i < s.length(); i++ ){
            if (lastC == ' ') {
                lastC = s.charAt(i);
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else {
                lastC = s.charAt(i);
                sb.append(lastC);
            }
        }
        System.out.println(sb.toString());
        reader.close();
    }


}
