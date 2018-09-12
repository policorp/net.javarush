package com.javarush.test.level09.lesson08.task02;

/* Catching exceptions
There are three exceptions sequentially inherited from Exception:
    class Exception1 extends Exception
    class Exception2 extends Exception1
    class Exception3 extends Exception2
    There’s a method, which is described as follows:
    public static void method1() throws Exception1, Exception2, Exception3

    Write a catch block to catch all the three Exception1, Exception2 and Exception3
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
      //add your code here
        try
        {
            method1();
        }
        catch (Exception3 e) {

        }
        catch (Exception2 e) {

        }
        catch (Exception1 e) {

        }
      //add your code here

    }

    public static void method1() throws Exception1, Exception2, Exception3
    {
        int i = (int) (Math.random() * 3);
        if (i == 0)
            throw new Exception1();
        if (i == 1)
            throw new Exception2();
        if (i == 2)
            throw new Exception3();
    }
}

class Exception1 extends Exception {
}

class Exception2 extends Exception1 {
}

class Exception3 extends Exception2 {
}