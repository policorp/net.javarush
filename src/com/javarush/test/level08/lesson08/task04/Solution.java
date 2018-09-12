package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Remove all the people born in the summer
Create a dictionary (Map<String, Date>) and add ten entries according to the model «last mane» - «birth date».
    Remove from the map all the people born in the summer.
*/

public class Solution
{
//    static HashMap<String, Date> map = createMap();
//
//    public static void main(String[] args) {
//        HashMap<String, Date> map = createMap();
//
//        System.out.println(map.size());
//        for (Map.Entry<String, Date> pair: map.entrySet()) {
//            System.out.println(pair.getKey() + " - " + pair.getValue());
//        }
//
//        System.out.println("REMOVING...");
//        removeAllSummerPeople(map);
//        System.out.println(map.size());
//        for (Map.Entry<String, Date> pair: map.entrySet()) {
//            System.out.println(pair.getKey() + " - " + pair.getValue());
//        }
//    }

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //add your code here
        for (int i = 0; i < 9; i++) {
            Date date = new Date();
            date.setMonth(i);
            map.put("lastName_" + i, date);

        }

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //add your code here
        Iterator <Map.Entry<String, Date>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Date> element = it.next();
            int month = element.getValue().getMonth();
            if (month > 4 && month < 8)
                it.remove();
        }

    }
}
