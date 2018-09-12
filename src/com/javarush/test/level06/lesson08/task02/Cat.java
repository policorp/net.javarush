package com.javarush.test.level06.lesson08.task02;

/* Static methods: int getCatCount() and setCatCount(int)
Add two static methods to the class Cat: int getCatCount() and setCatCount(int) using which you can get / change the number of cats (the variable catCount).
*/

public class Cat
{
    private static int catCount = 0;

    public Cat()
    {
        catCount++;
    }

    public static int getCatCount()
    {
        //add your code here
        return Cat.catCount;

    }

    public static void setCatCount(int catCount)
    {
        //add your code here
        Cat.catCount = catCount;
    }
}
