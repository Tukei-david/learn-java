package com.compare.strings;

import javax.swing.*;

public class Compare_strings {
    public static void main(String[] args) {
        String name1 = JOptionPane.showInputDialog("please input name 1: ");
        String name2 = JOptionPane.showInputDialog("Please input name 2: ");

        if (name1.equals(name2))
        {
            System.out.println("They are the same");
        }
        if (name1.compareTo(name2) == 0)
        {
            System.out.println("They are equal");
        }
        if (name1.compareTo(name2) < 0)
        {
            System.out.println("Name one is the first and Name two is the second");
        }
        if (name1.compareTo(name2) > 0)
        {
            System.out.println("Second name is the first and name one is the last");
        }
        System.exit(0);
    }
}
