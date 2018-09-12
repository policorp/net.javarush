package com.javarush.test.level08.lesson11.home06;

/* The whole family is together
Create a class Human with the fields: String name, boolean sex, int age, ArrayList<Human> children.
    2. Create 9 objects and fill them in such a way as to obtain two grandfathers, two grandmothers, a father, a mother, and three children.
    3. Display to the screen all the Human objects.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args)
    {
        //add your code here
        Human child_1 = new Human("child1", true, 17, new ArrayList<Human>());
        Human child_2 = new Human("child2", false, 13, new ArrayList<Human>());
        Human child_3 = new Human("child3", false, 11, new ArrayList<Human>());

        Human father = new Human("father", true,38, new ArrayList<Human>(Arrays.asList(child_1, child_2, child_3)));
        Human mother = new Human("mother", false, 34, new ArrayList<Human>(Arrays.asList(child_1, child_2, child_3)));

        Human gFatherF = new Human("gFatherF", true, 59, new ArrayList<Human>(new ArrayList<Human>(Arrays.asList(father))));
        Human gFatherM= new Human("gFatherM", true, 55, new ArrayList<Human>(new ArrayList<Human>(Arrays.asList(mother))));
        Human gMotherF = new Human("gMotherF", false, 62, new ArrayList<Human>(new ArrayList<Human>(Arrays.asList(father))));
        Human gMotherM = new Human("gMotherM", false, 59, new ArrayList<Human>(new ArrayList<Human>(Arrays.asList(mother))));


        System.out.println(gFatherF.toString());
        System.out.println(gMotherF.toString());
        System.out.println(gFatherM.toString());
        System.out.println(gMotherM.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child_1.toString());
        System.out.println(child_2.toString());
        System.out.println(child_3.toString());
    }

    public static class Human
    {
        //add your code here
        String name = "";
        boolean sex = true;
        int age = 0;
        ArrayList<Human> children = null;

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", children: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
