package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Three arrays
1. Read from the keyboard 20 numbers, save them in a list, then sort them into three other lists:
    List 1 stores numbers divisible by 3 (x%3==0)
    List 2 stores numbers divisible by 2 (x%2==0)
    List 3 stores the rest of numbers.
    The numbers divisible by 3 and 2 at the same time (for example 6) belong to both lists – list 1 and list 2.
    2. The method printList() should display each element of the list on a new line.
    3. Use the method printList() to display to the screen these three lists. First the list 1 should be displayed, then list 2, after that list 3.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            int number = Integer.parseInt(reader.readLine());
            if (number % 3 == 0) {
                list1.add(number);
                if (number % 2 == 0) {
                    list2.add(number);
                }
            }
            else {
                if (number % 2 == 0) {
                    list2.add(number);
                }
                else {
                    list3.add(number);
                }
            }
        }

        printList(list1);
        printList(list2);
        printList(list3);

        reader.close();
    }

    public static void printList(List<Integer> list)
    {
        //add your code here
        for (Integer item:list) {
            System.out.println(item);
        }
    }
}
