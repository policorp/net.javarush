package com.javarush.test.level05.lesson12.home02;

/* A Man and A Woman
1. Create public static classes Man and Woman within the class Solution.
    2. Classes must have fields: name(String), age(int), address(String).
    3. Create constructors to pass all the possible parameters to.
    4. Use the constructor to create two objects of each class with all the data.
    5. Display the objects in format [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //create two object of every class here
        Man man1 = new Man("man1", 19, "address1");
        Man man2 = new Man("man2", 22, "address2");
        Woman wman1 = new Woman("wman1" , 18, "addressw1");
        Woman wman2 = new Woman("wman2", 23, "addressw2");

        //output them to screen here
        System.out.println(man1.toString());
        System.out.println(man2.toString());
        System.out.println(wman1.toString());
        System.out.println(wman2.toString());
    }

    //add your classes here
    public static class Man {
        String name = null;
        int age = 0;
        String address = null;

        public Man(String name, String address)
        {
            this.name = name;
            this.address = address;
        }

        public Man(String name, int age)
        {

            this.name = name;
            this.age = age;
        }

        public Man(String name, int age, String address)
        {

            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString()
        {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        String name = null;
        int age = 0;
        String address = null;

        public Woman(String name, String address)
        {
            this.name = name;
            this.address = address;
        }

        public Woman(String name, int age)
        {

            this.name = name;
            this.age = age;
        }

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString()
        {
            return name + " " + age + " " + address;
        }
    }
}
