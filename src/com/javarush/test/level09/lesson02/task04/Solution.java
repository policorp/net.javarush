package com.javarush.test.level09.lesson02.task04;

/* Stack trace of 10 calls
Write code to get a stack trace of 10 calls.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static StackTraceElement[] method1()
    {
        return method2();
    }

    public static StackTraceElement[] method2()
    {
        //add your code here
        return method3();
    }

    public static StackTraceElement[] method3()
    {
        //add your code here
        return method4();
    }

    public static StackTraceElement[] method4()
    {
        //add your code here
        return method5();
    }

    public static StackTraceElement[] method5()
    {
        //add your code here
        return method6();
    }

    public static StackTraceElement[] method6()
    {
        //add your code here
        return method7();
    }

    public static StackTraceElement[] method7()
    {
        //add your code here
        return method8();
    }

    public static StackTraceElement[] method8()
    {
        //add your code here
        return method9();
    }

    public static StackTraceElement[] method9()
    {
        return method10();
    }

    public static StackTraceElement[] method10()
    {
        return Thread.currentThread().getStackTrace();
    }
}
