package com.javarush.test.level05.lesson05.task05;

/* Hold three twosome fights between cats
Create three cats using the class Cat.
    Hold three pairwise fights between cats.
    Do not create the class Cat. For the fight, use the method boolean fight(Cat anotherCat).
    Display the result of each fight.
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        Cat tom = new Cat("Tom", 4, 5, 10);
        Cat bak = new Cat("Bak", 4, 6, 10);
        Cat kemy = new Cat("Kemmy", 5, 5, 11);

        System.out.println(tom.fight(bak));
        System.out.println(kemy.fight(tom));
        System.out.println(bak.fight(kemy));
    }

    public static class Cat {

        public static int count = 0;
        public static int fightCount = 0;

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            fightCount++;

            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
