package com.javarush.test.level05.lesson09.task03;

/* Create a class Dog
Create a class Dog with three constructors:
    - Name
    - Name, height
    - Name, height, color
*/

public class Dog
{
    //add your code here
    String name;
    int height;
    String color;

    public Dog(String name, int height, String color)
    {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public Dog(String name, int height)
    {

        this.name = name;
        this.height = height;
    }

    public Dog(String name)
    {

        this.name = name;
    }
}
