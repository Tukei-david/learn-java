package com.example.calculations;

import javax.swing.*;

public class SentinelValues {
    public static void main(String[] args) {
        int value;
        int doublevalue;

        String input = JOptionPane.showInputDialog("Please put a value to double? (0 to stop)");
        value = Integer.parseInt(input);

        while (value != 0)
        {
            doublevalue = value * 2; // Creating the double multply
            JOptionPane.showMessageDialog(null, " " + value + " double value " + doublevalue);

            // Creating to change the main loop variable
            input = JOptionPane.showInputDialog("Please put a value to double? (0 to stop)");
            value = Integer.parseInt(input);
        }
        System.exit(0);
    }
}
