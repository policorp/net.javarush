package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Identical first and last names
Create a dictionary (Map<String, String>) and add ten entries according to the model «last name» - «first name».
    Check how many people have the same first or last name as the name specified.
*/

public class Solution
{
//    public static void main(String[] args) {
//        HashMap<String, String> base = createMap();
//        //System.out.println(base);
//        for (Map.Entry<String, String> pair: base.entrySet()) {
//            System.out.println(pair.getKey() + " - " + pair.getValue());
//        }
//
//        System.out.println();
//        System.out.println(getCountTheSameFirstName(base, "firstName_1"));
//        System.out.println(getCountTheSameLastName(base, "lastName_4"));
//    }

    public static HashMap<String, String> createMap()
    {
        //add your code here
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 10; i++) {
            map.put("lastName_" + i, "firstName_" + (i % 2 == 0 ? 1 : 2) + (i % 3 == 0 ? "_div" : ""));
        }
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //add your code here
        int counter = 0;
        for (Map.Entry<String, String> pair: map.entrySet()) {
            if (pair.getValue().equals(name))
                counter++;
        }
        return counter;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //add your code here
        if (map.containsKey(familiya))
            return 1;
        else
            return  0;
    }
}
