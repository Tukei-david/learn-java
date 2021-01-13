 package com.reading.examples;

import java.io.IOException;
import java.io.PrintWriter;

public class WritingToFiles {
    public static void main(String[] args) throws IOException
    {

        // Creating or replacing class or file
        PrintWriter outputFile = new PrintWriter("outputfile.txt");

        outputFile.println("This is line 1");
        outputFile.println("This is line 2");
        outputFile.println("This is line 3");

        outputFile.close();
    }
}
