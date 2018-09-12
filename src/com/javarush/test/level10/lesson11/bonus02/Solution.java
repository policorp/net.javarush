package com.javarush.test.level10.lesson11.bonus02;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* Add new functionality to the program.
    Old task: The program should display a pair (a number and a string) entered from the keyboard.
    New task: The program should store in HashMap pairs (a number and a string) entered from the keyboard.
    An empty string means the end of input. Numbers may be repeated. Strings are always unique. Input data must not be lost!
    The program should display the contents of HashMap to the screen.

    Example input:
    1
    Stop
    2
    Look

    Example output:
    1 Stop
    2 Look
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\m.polyakov\\Documents\\JavaRushHomeWork\\src\\com\\javarush\\test\\level10\\lesson11\\bonus02\\data.txt"));

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        while (true) {
            String buf = "";
            buf = reader.readLine();
            if (buf.equals("")) {
                break;
            }
            Integer id = Integer.parseInt(buf);
            buf = reader.readLine();
            if (buf.equals("")) {
                map.put("", id);
                break;
            }
            String name = buf;
            map.put(name, id);
            buf = "";
        }

        for(Map.Entry<String, Integer> pair: map.entrySet()) {
            System.out.printf("%d %s\n", pair.getValue(), pair.getKey());
        }
//        int id = Integer.parseInt(reader.readLine());
//        String name = reader.readLine();

//        System.out.println("Id=" + id + " Name=" + name);
    }
}
