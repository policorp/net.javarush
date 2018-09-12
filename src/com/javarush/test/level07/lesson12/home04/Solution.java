package com.javarush.test.level07.lesson12.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Read strings from the keyboard until user enters the string “end”
Create a list of strings.
    Read from the keyboard strings (whatever you want), add them to the list.
    Read strings from the keyboard until user enters the string “end”. “end” should be omitted.
    Display to the screen the strings. Each string should be on a new line.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //add your code here
        ArrayList<String> list = new ArrayList<String>();
        String str = reader.readLine();
        while (str.compareTo("end") != 0) {
            list.add(str);
            str = reader.readLine();
        }
        for (String item:list) {
            System.out.println(item);
        }
        reader.close();
    }
}
