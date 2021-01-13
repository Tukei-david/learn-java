package com.refrigerator.example;

import javax.swing.*;

public class ItemsDrivers {
    String kind;
    double weight;
    int daysAged;
    String Owner;
    boolean isFamily;
    static int count = 0;




    //Default Constructor
    public ItemsDrivers()
    {

    }

    // Primitive constructor with paramaters
    public ItemsDrivers(String kind, double weight, int daysAged, String Owner, boolean isFamily)
    {
        this.kind = kind;
        this.weight = weight;
        this.daysAged = daysAged;
        this.Owner = Owner;
        this.isFamily = isFamily;


        // counting the number of items in refrigirator
        for (int i = 0; i <= ItemsDrivers.count; ItemsDrivers.count++)
        {
            count = count + count;
        }
    }

    public void displayBag() {
        JOptionPane.showMessageDialog(null,
                kind + " " +
                        weight + " " +
                        daysAged + " " +
                        Owner + " " +
                        isFamily + "");
    }
}
