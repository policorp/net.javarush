package com.javarush.test.level06.lesson05.task02;

/* Classes Cat and Dog and finalize() method for each class
In each Cat and Dog class write a finalize() method, which displays to the screen a message that the object is destroyed.
*/

public class Cat
{
    //add your code here

    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("Cat is destroyed");;
    }
}

class Dog
{
    //add your code here

    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("Dog is destroyed");
    }
}