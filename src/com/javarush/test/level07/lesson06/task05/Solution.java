package com.javarush.test.level07.lesson06.task05;

/* Delete the last string and add it to the beginning of the list
1. Create a list of strings.
    2. Read from keyboard 5 strings. Add these strings to the list.
    3. Delete the last string and add it to the beginning of the list. Repeat this action 13 times.
    4. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        for (int i = 0; i < 13; i++) {
            String buffer = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(0, buffer);
        }
        for (String item:list) {
            System.out.println(item);
        }
        reader.close();
    }
}
