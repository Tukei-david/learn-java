package com.refrigerator.example;


import javax.swing.*;

public class refrigeratorIntake {
    public static void main(String[] args) {
        ItemsDrivers item = new ItemsDrivers("Milk", 2.32, 1, "Tukei David", true);
        ItemsDrivers item2 = new ItemsDrivers("Egg", 5.0, 1, "Isaiah Mutekhele", false);

        // Adding or removing days


        item.displayBag();

        item2.displayBag();


        JOptionPane.showMessageDialog(null, "Total number of items" + "\t\t\t" + ItemsDrivers.count);
    }


}