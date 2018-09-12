package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* The number of letters
Read from the keyboard 10 strings and count the number of different letters in them (for all 26 letters of the alphabet). Display the result to the screen.
    Example output:
    a 5
    b 8
    c 3
    d 7
    …
    z 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\m.polyakov\\Documents\\JavaRushHomeWork\\src\\com\\javarush\\test\\level10\\lesson11\\home05\\data.txt"));
        //ABC
        String abc = "abcdefghijklnopqrstuvwxyz";
        abc += "m";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        //String reading
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        //add your code here
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (char c: alphabet) {
            map.put(c, 0);
        }


        for(String s: list) {
            for (Character c: s.toCharArray()) {
                if (map.containsKey(c)) {
                    int count = map.get(c);
                    count++;
                    map.put(c, count);
                }
            }
        }

        for (Map.Entry<Character, Integer> pair: map.entrySet()) {
//            if (pair.getValue() == 0) {
//                continue;
//            }
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

}
