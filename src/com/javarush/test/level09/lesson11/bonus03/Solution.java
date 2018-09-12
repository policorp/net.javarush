package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* Learning and practicing algorithm.
Task: Read from the keyboard the list of words and numbers. Display to the screen words in ascending order and the numbers in descending order.

    Example input:
    Cherry
    1
    Bean
    3
    Apple
    2
    0
    Watermelon

    Example output:
    Apple
    3
    Bean
    2
    Cherry
    1
    0
    Watermelon
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty())
                break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

//        System.out.println("final result: ");
        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        //add your code here
        ArrayList<Boolean> orderList = new ArrayList<Boolean>(); //true for int, false for string
        ArrayList<Integer> intList = new ArrayList<Integer>();
        ArrayList<String> stringList = new ArrayList<String>();

        for (String s: array) {
//            System.out.println(s);
            Boolean isInt = isNumber(s);
            orderList.add(isInt);
            if (isInt) {
                //int
                intList.add(Integer.parseInt(s));
            }
            else {
                //string
                stringList.add(s);
            }
        }

        for (int i = 0; i < intList.size() - 1; i++)
        {
            for (int j = i + 1; j < intList.size(); j++)
            {
                //
                int a = intList.get(i);
                int b = intList.get(j);
                if (a < b)
                {
                    //
                    intList.remove(i);
                    intList.add(i, b);
                    intList.remove(j);
                    intList.add(j, a);
                }
            }
        }

//        System.out.println("Integer array:");
//        for (Integer x: intList) {
//            System.out.println(x);
//        }

        for (int i = 0; i < stringList.size() - 1; i++) {
            for (int j = i + 1; j < stringList.size(); j++) {
                //
                String a = stringList.get(i);
                String b = stringList.get(j);
                if (isGreaterThen(a, b)) {
                    stringList.remove(i);
                    stringList.add(i, b);
                    stringList.remove(j);
                    stringList.add(j, a);
                }
            }
        }

        int intCounter = 0;
        int stringCounter = 0;

        for (int i = 0; i < array.length; i++) {
            if (orderList.get(i)) {
                //int
                array[i] = intList.get(intCounter).toString();
                intCounter++;
            }
            else {
                //string
                array[i] = stringList.get(stringCounter);
                stringCounter++;
            }
        }
    }

    //String compare method: '?' greater then 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //Is string a number?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0)
            return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //Contains '-' inside string
                    || (!Character.isDigit(c) && c != '-') ) // Not a digit, does not begin with '-'
            {
                return false;
            }
        }
        return true;
    }
}
