package com.examples.loops;

public class loopsInto {
    public static void main(String[] args) {
        // while loop

        // declare loop variable
        int x = 0;

        while (x < 5)
        {
            System.out.println("Hello World!");
            x = x + 1;
        }
            System.out.println("");
        // do-while loop
        int y = 0; // Declare a local variable

        do {
            System.out.println("Hello world!");
            y++;
        }while (y < 5);
            System.out.println("");
        // for loop
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Hello World!");
        }
    }
}
