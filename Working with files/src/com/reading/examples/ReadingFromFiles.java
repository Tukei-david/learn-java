package com.reading.examples;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFromFiles {
    public static void main(String[] args) throws IOException
    {
        File file = new File("outputfile.txt"); // Extracting the file

        if (file.exists())
        {
            Scanner inputFile = new Scanner(file);

            // Printing out the dat in file using system.out
//            System.out.println(inputFile.nextLine());
//            System.out.println(inputFile.nextLine());
//            System.out.println(inputFile.nextLine());


            // Shorthand method
            while (inputFile.hasNext())
            {
                System.out.println(inputFile.nextLine());
            }

            inputFile.close(); //EXit the file
        }
        else
        {
            JOptionPane.showMessageDialog(null, "This file doen't exist");
        }
    }
}
