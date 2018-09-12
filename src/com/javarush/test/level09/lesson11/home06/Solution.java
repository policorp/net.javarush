package com.javarush.test.level09.lesson11.home06;

import java.util.ArrayList;

/* The tale of the Little Red Riding Hood
1. There are five classes: Red Riding Hood, grandmother, patty, woodcutter, wolf.
    2. Each class has two fields of ArrayList type: killed and ate.
    3. Necessary objects are already created (hood, grandmother, ...).
    4. Create the correct relationship (who ate and killed whom) to get the logic of the «Little Red Riding Hood».
*/

public class Solution {
    public static LittleRedRidingHood hood = new LittleRedRidingHood(); //красная шапочка
    public static Grandmother grandmother = new Grandmother(); //бабушка
    public static Patty patty = new Patty(); //пирожок
    public static Woodman woodman = new Woodman(); //лесник
    public static Wolf wolf = new Wolf(); //воук

    public static void main(String[] args) {
        // add your code here
        woodman.killed.add(wolf);
        wolf.ate.add(grandmother);
        wolf.ate.add(hood);
        hood.ate.add(patty);

    }

    //Little Red Riding Hood
    public static class LittleRedRidingHood extends StoryItem {
    }

    //Grandma
    public static class Grandmother extends StoryItem {
    }

    //Patty
    public static class Patty extends StoryItem {
    }

    //Lumberjack
    public static class Woodman extends StoryItem {
    }

    //Wolf
    public static class Wolf extends StoryItem {
    }

    public static abstract class StoryItem {
        public ArrayList<StoryItem> killed = new ArrayList<StoryItem>();
        public ArrayList<StoryItem> ate = new ArrayList<StoryItem>();
    }
}
