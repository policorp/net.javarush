package com.javarush.test.level07.lesson12.home06;

/* Family
Create a class Human with the fields: String name, boolean sex, int age, Human father, Human mother. Create 9 objects of Human class
    and fill them in such a way as to obtain two grandfathers, two grandmothers, a father, a mother, and three children. Display to the screen the objects to the screen.
    Tip:
    If you write your method String toString() in the class Human, then it’ll be used to display an object.
    Example output:
    Name: Anna, sex: female, age: 21, father: Paul, mother: Kate
    Name: Kate, sex: female, age: 55
    Name: Ian, sex: male, age: 2, father: Michael, mother: Anna
    …
*/

public class Solution
{
    public static void main(String[] args)
    {
        //add your code here
        Human momsFather = new Human("momfather", true, 56, null, null);
        Human momsMother = new Human("mommother", false, 54, null, null);
        Human dadsFather = new Human("dadfather", true, 58, null, null);
        Human dadsMother = new Human("dadmother", false, 60, null, null);
        Human mom = new Human("mom", false, 31, momsFather, momsMother);
        Human dad = new Human("dad", true, 35, dadsFather,dadsMother);
        Human child1 = new Human("child1", true, 16, dad, mom);
        Human child2 = new Human("child2", false, 11, dad, mom);
        Human child3 = new Human("child3", true, 2, dad, mom);

        System.out.println(momsFather.toString());
        System.out.println(momsMother.toString());
        System.out.println(dadsFather.toString());
        System.out.println(dadsMother.toString());
        System.out.println(mom.toString());
        System.out.println(dad.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human
    {
        //add your code here
        String name = "";
        boolean sex;
        int age;
        Human father = null, mother = null;

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }

}
