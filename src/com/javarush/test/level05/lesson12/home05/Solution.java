package com.javarush.test.level05.lesson12.home05;

/* Read numbers from keyboard and calculate their total
Read numbers from keyboard and calculate their total until the user enters the word «total». Display to the screen the total.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int number = 0;
        int count = 0;
        String buffer = "";
        while (true) {
            buffer = reader.readLine();
            if (buffer.equals("сумма")) {
                System.out.println(sum);
                //System.out.println(count);
                break;
            }
            else {
                number = Integer.parseInt(buffer);
                sum += number;
                count++;
            }
        }

        //System.out.println(sum);
        //System.out.println(count);
        reader.close();
    }
}
