package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Move first M lines to the end of the list
Read from the keyboard 2 numbers: N and M.
    Read from keyboard N strings and fill a list with them.
    Move first M lines to the end of the list
    Display to the screen the list. Each value should be on a new line.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //add your code here
        ArrayList<String> list = new ArrayList<String>();
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt((reader.readLine()));
        int curIndex = 0;
        for (int i = 0; i < n; i++) {
            if (m > 0) {
                list.add(reader.readLine());
                m--;
            }
            else {
                list.add(curIndex, reader.readLine());
                curIndex++;
            }
        }
        for (String item:list) {
            System.out.println(item);
        }
        reader.close();
    }
}
