package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Remove people having the same first name
Create a dictionary (Map<String, String>) and add ten entries according to the model «last name» - «first name».
    Remove people that have the same first name.
*/

public class Solution
{
//    public static void main(String[] args) {
//        HashMap<String, String > dictionary = createMap();
//
//        System.out.println(dictionary.size());
//        for (Map.Entry<String, String> pair: dictionary.entrySet()) {
//            System.out.println(pair.getKey() + " - " + pair.getValue());
//        }
//        //removeTheFirstNameDuplicates(dictionary);
//
//        System.out.println("\nREMOVING...");
//        removeTheFirstNameDuplicates(dictionary);
//        System.out.println(dictionary.size());
//        for (Map.Entry<String, String> pair: dictionary.entrySet()) {
//            System.out.println(pair.getKey() + " - " + pair.getValue());
//        }
//    }

    public static HashMap<String, String> createMap()
    {
        //add your code here
        HashMap<String, String> map = new HashMap<String, String>();

        for(int i = 0; i < 10; i++) {
            String last = "lastName_" + i;
            String first = "firstName_" + (i % 3 == 0? i + 5: "p");
            map.put(last, first);
        }
        return  map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //add your code here
        HashMap<String, Integer> infoMap = new HashMap<String, Integer>();
        for (Map.Entry<String, String> pair: map.entrySet()) {
            if (infoMap.containsKey(pair.getValue())) {
                //
                infoMap.put(pair.getValue(), (infoMap.get(pair.getValue()) + 1));
            }
            else {
                infoMap.put(pair.getValue(), 1);
            }
        }

        //System.out.println(infoMap.size());

        for (Map.Entry<String, Integer> pair: infoMap.entrySet()) {
            if (pair.getValue() > 1) {
                removeItemFromMapByValue(map, pair.getKey());
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
