package com.classes.objects;

import javax.swing.*;

public class Drivers {
    public static void main(String[] args) {
        // First way to create objects by passing parameters on brackets
        BagOfCheese bag = new BagOfCheese("Cheddar", 2.43, 30, true);
        BagOfCheese bag2 = new BagOfCheese("blue", 3.45, 60, false);


        // Second way of creating objects
//        BagOfCheese bag = new BagOfCheese();
//        bag.kind = "Cheddar";
//        bag.weight = 2.43;
//        bag.daysAged = 30;
//        bag.isDomestic = true;
//
//
//        BagOfCheese bag2 = new BagOfCheese();
//        bag2.kind = "blue";
//        bag2.weight = 3.45;
//        bag2.daysAged = 60;
//        bag2.isDomestic = false;


        bag.displayBag();

        bag2.displayBag();


    }






}
