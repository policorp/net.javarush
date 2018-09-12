package com.javarush.test.level06.lesson05.task04;

/* Cat counter
In Cat class constructor [public Cat()], increase the cat counter (static variable catCount of the same class) by 1. In the method finalize() decrease by 1.
*/

public class Cat
{
    public static int catCount = 0;

    //add your code here


    @Override
    protected void finalize() throws Throwable
    {
        catCount--;
        super.finalize();
    }

    public Cat()
    {
        catCount++;
    }

    public static void main(String[] args) {
    }
}
