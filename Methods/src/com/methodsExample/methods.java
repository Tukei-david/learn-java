package com.methodsExample;

import javax.swing.*;

public class methods {
    public static void main(String[] args) {
        // Call the method
        averagesum(30, 60);

        // Calling the return variable
        // double average = getaverage(30,30);
        // System.out.println("Average: " + average);

        // Asking the user for name
        // String firstName = JOptionPane.showInputDialog("What is your firstname?");
        // String surName = JOptionPane.showInputDialog("What  is your surname?");

        // String Names = fullName(JOptionPane.showInputDialog("What is your firstname?"),
                // JOptionPane.showInputDialog("What  is your surname?"));
        // JOptionPane.showMessageDialog(null, "Your Name is " + Names);
        int value;
        String input = JOptionPane.showInputDialog("WHat is your number?");
        value = Integer.parseInt(input);

        if (isValid(value))
        {
            JOptionPane.showMessageDialog(null, "The value is in range");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "The value is not in range");
        }

    }

    /**
     * These method calcalute the average of two numbers
     * @param val1 The first value
     * @param val2 The second value
     */
    public static void averagesum(int val1, int val2)
    {
        double average = (val1 + val2) / 2.0;
        System.out.println("Average " + average);
    }

    /**
     * These method calculate the avarage and return it
     * @param val1 The first value
     * @param val2 The second value
     * @return The average value returned
     */
    public static double getaverage(int val1, int val2)
    {
        double average = (val1 + val2) / 2.0;
        return average;
    }

    // value returning method string
    public static String fullName(String name, String surName)
    {
        // String userName = name + " " + surName;
        // return userName;

        // Shorthand method
        return name + " " + surName;
    }

    // Using booleans in range
    public static boolean isValid(int number)
    {
//        boolean status;
//
//        if (number >= 1 && number <= 100)
//        {
//            status = true;
//        }
//        else
//        {
//            status =  false;
//        }
//        return status;
        return (number >= 1 && number <= 100);
    }
}
