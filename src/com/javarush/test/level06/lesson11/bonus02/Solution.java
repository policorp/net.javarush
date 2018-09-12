package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Add new functionality to the program.
Old task: Every cat has a name and a mom cat. Write a class to describe this situation. Create two objects: a daughter cat
    and a mom cat. Display them to the screen.
    New task: Every cat has a name, a dad cat and a mom cat. Write a class to describe this situation. Create 6 objects: mom,
    dad, son, daughter, grandma (mom’s mom) and grandpa (dad’s dad). Display them to the screen as follows: grandpa, grandma,
    dad, mom, son and daughter.

    Example input:
    grandpa Vinny
    grandma Maisy
    dad Kaos
    mom Velvet
    son Mario
    daughter Fluffy

    Example output:
    Cat name is grandpa Vinny, no mother, no father
    Cat name is grandma Maisy, no mother, no father
    Cat name is dad Kaos, no mother, father is grandpa Vinny
    Cat name is mom Velvet, mother is grandma Maisy, no father
    Cat name is son Mario, mother is mom Velvet, father is dad Kaos
    Cat name is daughter Fluffy, mother is mom Velvet, father is dad Kaos
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\m.polyakov\\Documents\\JavaRushHomeWork\\src\\com\\javarush\\test\\level06\\lesson11\\bonus02\\data"));

        Cat catGrandpa = new Cat(reader.readLine());
        Cat catGrandma = new Cat(reader.readLine());
        Cat catDad = new Cat(reader.readLine(), catGrandpa, null);
        Cat catMom = new Cat(reader.readLine(), null, catGrandma);
        Cat catSon = new Cat(reader.readLine(), catDad, catMom);
        Cat catDaughter = new Cat(reader.readLine(), catDad, catMom);

        System.out.println(catGrandpa);
        System.out.println(catGrandma);
        System.out.println(catDad);
        System.out.println(catMom);
        System.out.println(catSon);
        System.out.println(catDaughter);

        reader.close();
    }

    public static class Cat
    {
        private String name;
        private Cat parentMother;
        private Cat parentFather;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat parentFather, Cat parentMother)
        {
            this.name = name;
            this.parentMother = parentMother;
            this.parentFather = parentFather;
        }

        @Override
        public String toString()
        {
            StringBuilder stringBuilder = new StringBuilder("Cat name is " + name);
            if (parentMother == null)
                stringBuilder.append(", no mother");
            else
                stringBuilder.append(", mother is " + parentMother.name);

            if (parentFather == null)
                stringBuilder.append(", no father");
            else
                stringBuilder.append(", father is " + parentFather.name);
            return stringBuilder.toString();
        }
    }

}
