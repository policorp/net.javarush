package com.javarush.test.level10.lesson11.home06;

/* Constructors of the class Human
Write a class Human with 6 fields. Come up with 10 different constructors for it and implement them. Each constructor should have meaning.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //Write here variables and constructors
        int wight = 0;
        int growth = 0;
        int iq = 0;
        boolean gender = false;
        String name = "";
        String address = "";

        public Human(int iq)
        {
            this.iq = iq;
        }

        public Human(int wight, int growth, int iq)
        {
            this.wight = wight;
            this.growth = growth;
            this.iq = iq;
        }

        public Human(int growth, String address)
        {
            this.growth = growth;
            this.address = address;
        }

        public Human(int wight, int iq)
        {
            this.wight = wight;
            this.iq = iq;
        }

        public Human(int iq, boolean gender, String name, String address)
        {
            this.iq = iq;
            this.gender = gender;
            this.name = name;
            this.address = address;
        }

        public Human(int iq, boolean gender, String name)
        {

            this.iq = iq;
            this.gender = gender;
            this.name = name;
        }

        public Human(String name, String address)
        {

            this.name = name;
            this.address = address;
        }

        public Human(int wight, int growth, String name)
        {

            this.wight = wight;
            this.growth = growth;
            this.name = name;
        }

        public Human(String name)
        {

            this.name = name;
        }

        public Human(int wight, int growth, int iq, boolean gender, String name, String address)
        {

            this.wight = wight;
            this.growth = growth;
            this.iq = iq;
            this.gender = gender;
            this.name = name;
            this.address = address;
        }
    }
}
