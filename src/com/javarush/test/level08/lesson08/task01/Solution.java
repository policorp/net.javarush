package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 words beginning with «L»
Create a set of strings (Set<String>), place into it 20 words beginning with «L».
*/

public class Solution
{
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++)
//        {
//            HashSet<String> sur = createSet();
//            //System.out.println(sur);
//            System.out.println(sur.size());
//        }
//    }

    public static HashSet<String> createSet()
    {
        //add your code here
        HashSet<String> list = new HashSet<String>();
        for (int i = 0; i < 20; i++) {
            String buf = "L" + i;
//            if (!list.contains(buf))
                list.add(buf);
        }

//        list.add("Лила");
//        list.add("Люда");
//        list.add("Лора");
//        list.add("Люк");
//        list.add("Ллейс");
//        list.add("Лайка");
//        list.add("Ложка");
//        list.add("Лимон");
//        list.add("Лопух");
//        list.add("Лизун");
//
//        list.add("Люс");
//        list.add("Лама");
//        list.add("Лаунч");
//        list.add("Лира");
//        list.add("Лада");
//        list.add("Лампочка");
//        list.add("Люстра");
//        list.add("Лиса");
//        list.add("Лань");
//        list.add("Лорд");


//        list.add("Lила");
//        list.add("Lюда");
//        list.add("Lора");
//        list.add("Lюк");
//        list.add("Lлейс");
//        list.add("Lайка");
//        list.add("Lожка");
//        list.add("Lимон");
//        list.add("Lопух");
//        list.add("Lизун");
//
//        list.add("Lюс");
//        list.add("Lама");
//        list.add("Lаунч");
//        list.add("Lира");
//        list.add("Lада");
//        list.add("Lампочка");
//        list.add("Lюстра");
//        list.add("Lиса");
//        list.add("Lань");
//        list.add("Lорд");

        return list;
    }
}
