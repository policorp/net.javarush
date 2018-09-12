package com.javarush.test.level05.lesson05.task02;

/* Implement method fight
Implement method boolean fight(Cat anotherCat): implement a fight mechanism depending on cats’ weight, age and strength. Make up a dependency by yourself. The method should determine, whether current cat (the object whose fight method was called) or anotherCat won fight, i.e. return true if current cat won and false, if it didn’t win. The following condition must be met:
    if cat1.fight(cat2) = true, then cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat()
    {
    }

    public boolean fight(Cat anotherCat)
    {
        //add your code here
        if (this.strength > anotherCat.strength) {
            return true;
        }
        else {
            return false;
        }
    }
}
