package com.javarush.test.level09.lesson11.bonus02;

import java.io.*;

/* Add new functionality to the program.
Old task: The program should read from the keyboard two file names and to copy the first file to the location specified by the second name.
    New task: The program should read from the keyboard two file names and to copy the first file to the location specified by the second name.
    If the file (that is going to be copied) with the specified name doesn’t exist, the program should display to the screen the message
    «File does not exist» and try to read the file name from the console once again before reading the name of second (destination) file.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(sourceFileName);
        }
        catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
            System.out.println("File does not exist.");
            sourceFileName = reader.readLine();
            fileInputStream = new FileInputStream(sourceFileName);
        }

        String destinationFileName = reader.readLine();
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);

//        String sourceFileName = "C:\\Users\\m.polyakov\\Documents\\JavaRushHomeWork\\src\\com\\javarush\\test\\level09\\lesson11\\bonus02\\inputFile2";
//        String destinationFileName = "C:\\Users\\m.polyakov\\Documents\\JavaRushHomeWork\\src\\com\\javarush\\test\\level09\\lesson11\\bonus02\\outputFile2";

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
