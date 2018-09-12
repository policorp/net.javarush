package com.javarush.test.level05.lesson09.task05;

/* Create a class Rectangle
Create a class Rectangle. Its data will be top, left, width and height. Create for it as much constructors as possible:
    Examples:
    -	4 parameters are set: left, top, width, height
    -	width/height are not set (both equal 0)
    -	height are not set (equal to width), create a square
    -	create a copy of another rectangle (it’s passed in the parameters)
*/

public class Rectangle
{
    //add your code here
    int left, top, width, height;

    public Rectangle(Rectangle rect) {
        this.height = rect.height;
        this.width = rect.width;
        this.left = rect.left;
        this.top = rect.top;
    }

    public Rectangle(int left, int top, int width)
    {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }

    public Rectangle(int left, int top)
    {
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;

    }

    public Rectangle(int left, int top, int width, int height)
    {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
}
