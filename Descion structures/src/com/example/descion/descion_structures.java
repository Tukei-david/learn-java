package com.example.descion;

import javax.swing.*;

public class descion_structures {
    public static void main(String[] args)
    {
        int number;

        String input;

        input = JOptionPane.showInputDialog("What is your mark: ");

        // Changing the input to integer
        number = Integer.parseInt(input);


        // use if and else to descied to what to do
        /*
        if (number == 5)
        {
            JOptionPane.showMessageDialog(null, "Your number is exactly 5!");
        }
        else if (number > 5)
        {
            JOptionPane.showMessageDialog(null, "Your number is greater than 5!");
        }
        else if (number > 10)
        {
            JOptionPane.showMessageDialog(null, "Your number is greater than 10!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Your number is less than 5!");
        }
        */

        if (number < 50)
        {
            if (number >= 45)
            {
                JOptionPane.showMessageDialog(null, "You can write re-assesment");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "You have failed");
            }
        }
        else
        {
            if (number >= 75)
            {
                JOptionPane.showMessageDialog(null, "Your constaint");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "You passed");
            }
        }
        System.exit(0);
    }
}
