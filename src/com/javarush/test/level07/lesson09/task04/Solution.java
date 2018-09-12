package com.javarush.test.level07.lesson09.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Letters «r» and «l»
1. Create a list of words/strings, fill it with whatever you want.
    2. The method fix() should:
    2.1. delete all the words containing letter «r» from the list of strings
    2.2. double all the words containing letter «l».
    2.3. leave the word unchanged if it contains both letters «r» and «l».
    2.4. don’t do anything with other words.

    Example:
    rose
    willow
    lyre
    oak

    Output data:
    willow
    willow
    lyre
    oak
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); //0
        list.add("lyre"); //1
        list.add("willow"); //2
        list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list)
    {
        //add your code here
        ArrayList<String> listMod = new ArrayList<String>();
        for (String item: list) {
            if (item.contains("r") && item.contains("l")) {
                //
                listMod.add(item);
                continue;
            }
            if (item.contains("r")) {
                continue;
            }
            if (item.contains("l")) {
                listMod.add(item);
                listMod.add(item);
                continue;
            }
            listMod.add(item);
        }
        return listMod;
    }
}