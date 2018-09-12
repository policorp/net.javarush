package com.javarush.test.level09.lesson02.task02;

/* StackTrace again
Write five methods that call each other. Each method should return the name of its caller method.
    You can obtain caller method using StackTrace.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static String method1()
    {
        method2();
        //add your code here
        //System.out.println("m1 + " + Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method2()
    {
        method3();
        //add your code here
        //System.out.println("m2 + " + Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3()
    {
        method4();
        //add your code here
        //System.out.println("m3 + " + Thread.currentThread().getStackTrace()[0].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4()
    {
        method5();
        //add your code here
        //System.out.println("m4 + " + Thread.currentThread().getStackTrace()[0].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method5()
    {
        //add your code here
        //System.out.println("m5 + " + Thread.currentThread().getStackTrace()[0].getMethodName());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
