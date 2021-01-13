package com.example.calculations;

import javax.swing.*;

public class InputValidation {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Please input number in the range between 1 and 100: ");

        int number = Integer.parseInt(input);

        while (number < 1 || number > 100)// Check if the number is between 1 and 100
        {
            JOptionPane.showMessageDialog(null, "That number is not valid");
            input = JOptionPane.showInputDialog("Please input number in the range between 1 and 100: ");
            number = Integer.parseInt(input);
        }
        JOptionPane.showMessageDialog(null, "Correct");

        System.exit(0);
    }
}
