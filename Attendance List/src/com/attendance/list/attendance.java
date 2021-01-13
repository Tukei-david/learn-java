package com.attendance.list;

import javax.swing.*;
import java.io.*;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class attendance {

    /**
     * These methods returns the name of the day manager after checking the file and add one before printing another one
     * @return The name of the day manager
     * @throws IOException These throws exception of file not found in the program
     */
    public static String getDayManager() throws IOException
    {
        String presenter = " ";
        // Recreate a file
        File dayManager = new File("Lionsmanagers.txt");

        // Check if present or not
        if (dayManager.exists())
        {
            // Scanning the Managers file
            Scanner scanFile = new Scanner(dayManager);

            if(scanFile.hasNext()) {
                presenter = "DAYMANAGER: " +  scanFile.nextLine();
                // Show the name of the day manager depending on the current date using loop
                // JOptionPane.showMessageDialog(null, "DAY MANAGER: " + presenter);
                scanFile.close();
            }

        }else
        {
            JOptionPane.showMessageDialog(null, "The file doesn't exist");
        }

        return presenter;
    }

    /**
     * These method prints the user input to the day attendance list file in te program
     * @param input User input
     * @throws IOException Trows not found file excpetion in the program
     */

    public static void writeOnFile(String input) throws  IOException
    {

        File file = new File("C:/Users/Tukei/Desktop/Dayattendance.txt");
        if (file.exists())
        {
            FileWriter newFile = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(newFile);
            bw.write(input);
            bw.newLine();
            bw.close();
            newFile.close();


        }
        else {
            JOptionPane.showMessageDialog(null, "The file doesn't exists");

        }
    }


    /**
     * These methods prints out the name of students in the file
     * @param file The file targeted to read on
     * @throws IOException These throws FileNotFoundException Error
     */
    public static void readFile(File file) throws IOException
    {
        String [] names; // For saving names of the student
        int count = 0; // Used for triggering count on while loop
        File newFile = new File("C:/Users/Tukei/Desktop/Dayattendance.txt"); // path file
        // Check if the file exists
        if (newFile.exists())
        {
            Scanner scanFile1 = new Scanner(newFile);
            while (scanFile1.hasNext())
            {
                count = count + 1;
                scanFile1.nextLine();
            }

            names = new String[count];
            Scanner scanFile2 = new Scanner(file);
            for (int i = 0; i < count; i++)
            {
                names[i] = scanFile2.nextLine();
            }

            // Printing all values in array
            for (int y = 0; y < names.length; y++)
            {
                    System.out.println(y + " " + names[y]);
            }
            // Printing the total number of students present
            JOptionPane.showMessageDialog(null, "Total Student present: " + names.length);
        }
        else {
            JOptionPane.showMessageDialog(null, "The file doesn't exist");
        }
    }

    /**
     * These methods gets the user rating and gets its average
     */
    public static void getManagersRating()
    {
        try {
            String input;
            input = JOptionPane.showInputDialog(null, "First person rating: ");
            double firstRate = Double.parseDouble(input);
            input = JOptionPane.showInputDialog(null, "Second person rating: ");
            double secondRate = Double.parseDouble(input);
            input = JOptionPane.showInputDialog(null, "Third person rating: ");
            double thirdRate = Double.parseDouble(input);

            findAverage(firstRate, secondRate, thirdRate);
        }catch (Exception e)
        {
           System.out.println("Invalid value");
           getManagersRating();

        }


    }

    /**
     * These methods prints out the average rating of te day manager;
     * @param firstNumber First person rate
     * @param secondNumber Second person rate
     * @param thirdNumber Third person rate
     * @return average return the final ratings
     */
    public static double findAverage(double firstNumber, double secondNumber, double thirdNumber)
    {
        double average;
        average = (firstNumber + secondNumber + thirdNumber) / 3;
        // Round to one decimal place
        DecimalFormat roundToOne = new DecimalFormat("#");
        JOptionPane.showMessageDialog(null,
                roundToOne.format(average) + " Stars");
        return average;
    }

    public static void main(String[] args) throws IOException
    {
        String userInput; // Use these variable to take the user input
        // Show the date of day
        LocalDate currentDay = LocalDate.now();
        // Show the time of the day
        LocalTime currentTime = LocalTime.now();
        // JOptionPane.showMessageDialog(null,
         //        "The current day and time is " + currentDay + " " + currentTime);



        // Checking if the time is valid and number doesn't exceed total number of students
        // LocalTime attendenceOpen = LocalTime.of(7, 30);
        // LocalTime attendenceClose = LocalTime.of(8, 30);

        // Getting period between the allocated time

        // Creating variable to represent the number of students
        int numberOfStudents = 5;
        int count = 1;

        // Using for loop to make the input dialog run until the total number of students is attained
        for (count = 1; count < numberOfStudents; count++)
        {
            // Show the day manager of the day
            userInput = JOptionPane.showInputDialog(null,
                    getDayManager() + " \nDATE: " + currentDay + " \n Please write Your name below: ");
            // Show the instructions, "deadline of attendance in time"
            // Ask the name of the lion
            writeOnFile(userInput);
        }

        // Getting the user ratings
        getManagersRating();

        // Outputing the names of people who were present in the attendance list
        File newFile = new File("C:/Users/Tukei/Desktop/Dayattendance.txt"); // path file
        if (newFile.exists())
            readFile(newFile);
        else {
            JOptionPane.showMessageDialog(null, "The file doesn't exists");
        }


    }
}
