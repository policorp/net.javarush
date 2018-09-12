package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Set;

/* Remove all the numbers greater than 10
Create a set of numbers (Set<Integer>), place into it 20 different numbers.
    Remove from the set all the numbers greater than 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        //add your code here
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //add your code here
        HashSet <Integer> newSet = new HashSet<Integer>();
        for (int number: set) {
            if(number <10)
                newSet.add(number);
        }
        return newSet;
    }
}
