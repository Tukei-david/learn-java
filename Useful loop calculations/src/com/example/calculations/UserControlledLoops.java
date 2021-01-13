package com.example.calculations;

import javax.swing.*;

public class UserControlledLoops {
    public static void main(String[] args) {
        int maxvalue;

        String input = JOptionPane.showInputDialog("How high should i go to square the number?");
        maxvalue = Integer.parseInt(input);

        for (int number = 1; number <= maxvalue; number++)
        {
            System.out.println(number + "\t\t\t\t" + number*number);
        }
    }
}
