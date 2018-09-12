package com.javarush.test.level07.lesson06.task02;

/* 5 lines: «101», «102», «103», «104», «105»
1. Create a list of strings.
    2. Add 5 strings to the list. «101», «102», «103», «104», «105».
    3. Delete the first one, the middle one and the last one.
    4. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
    5. Display to the screen its size. (After deleting one entry, the indexes of other entries change. For instance, if we delete first element, the second becomes the first one).
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        ArrayList<String> list = new ArrayList<String>();
        list.add("101");
        list.add("102");
        list.add("103");
        list.add("104");
        list.add("105");

        list.remove(0);
        list.remove((list.size()- 1) / 2);
        list.remove(list.size() - 1);

        for (String item:list) {
            System.out.println(item);
        }
        System.out.println(list.size());
    }
}
