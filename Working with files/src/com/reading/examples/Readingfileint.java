package com.reading.examples;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Readingfileint {
    public static void main(String[] args) throws IOException
    {
        int sum = 0;
        int count = 0;
        double average;

        File fileNew = new File("outputfile.txt");

        // Check if the file e xists
        if (fileNew.exists())
        {
            Scanner inputFile = new Scanner(fileNew);

            while (inputFile.hasNext())
            {
                sum = sum + inputFile.nextInt();
                count++;
            }
            inputFile.close();

            // Needs to be a double but it is not (double)
            average = sum / (double) count;

            JOptionPane.showMessageDialog(null,
                    "Value is " + sum + "\n"  + "Total number of values " + count + "\n" + " Average " + average);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "The file doesn't exist");
        }
    }
}
