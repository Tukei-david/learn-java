package com.classes.objects;

import javax.swing.*;
import java.nio.file.WatchEvent;

public class BagOfCheese {
    String kind;
    double weight;
    int daysAged;
    boolean isDomestic;


    // Construcator calls withourt paramaters
    // Must be created if you define another constructor
    BagOfCheese ()
    {

    }


    // Constructor calls without parameters defined
    BagOfCheese (String kind, double weight, int daysAged, boolean isDomestic)
    {

        this.kind = kind;
        this.weight = weight;
        this.daysAged = daysAged;
        this.isDomestic = isDomestic;

    }

    public void displayBag() {
        JOptionPane.showMessageDialog(null,
                kind + ", " +
                        weight + ", " +
                        daysAged + ", " +
                        isDomestic + " "
        );
    }

}
