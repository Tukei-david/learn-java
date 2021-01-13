package com.reading.input.using.JOptionPane;

import javax.swing.*;

public class ReadJOptionPane {
    public static void main(String[] args) {
        String name;
        String surname;

        name = JOptionPane.showInputDialog("What is your name? ");
        surname = JOptionPane.showInputDialog("What is your surname");

        JOptionPane.showMessageDialog(null, name + " " + surname );

        int firstNumber;
        int secondNumber;
        String input;

        input = JOptionPane.showInputDialog("Please enter the first number: ");
        firstNumber = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Please enter your second number: ");
        secondNumber = Integer.parseInt(input);

        double average = (firstNumber + secondNumber) / 2.0;

        JOptionPane.showMessageDialog(null, "Average is: " + average);
    }
}
