package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* People with the same first names and/or last names
1. Create a dictionary (<String, String>) and add 10 persons according to the model «last name» - «first name».
    2. Among these 10 persons, let there be people with the same first names.
    3. Among these 10 persons, let there be people with the same last names.
    4. Display to the screen contents of the Map.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        //add your code here
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 10; i++) {
            String lastName = "lastName_" + (i % 4 == 0? 1: i);
            String firstName = "firstName_" + (i % 2 == 0? "j": "hk");
            map.put(lastName, firstName);
        }
        return map;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
