package com.javarush.test.level05.lesson07.task03;

/* Create a class Dog
Create a class Dog with three initializers:
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

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public void initialize(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }
}
