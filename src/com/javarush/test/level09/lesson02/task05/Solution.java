package com.javarush.test.level09.lesson02.task05;

/* The method should return a result - its stack trace depth
Write a method that displays and returns its stack trace depth. Stack trace depth is the number of its methods (the number of elements in the list).
*/

public class Solution
{
    public static void main(String[] args) {
        System.out.println(getStackTraceDeep());
    }

    public static int getStackTraceDeep()
    {
        //add your code here
//        System.out.println(Thread.currentThread().getStackTrace().toString());
//        for (StackTraceElement item:Thread.currentThread().getStackTrace()) {
//            System.out.println(item.getMethodName());
//        }
        StackTraceElement[] mas = Thread.currentThread().getStackTrace();
        System.out.println(mas.length);
        return mas.length;
    }
}
