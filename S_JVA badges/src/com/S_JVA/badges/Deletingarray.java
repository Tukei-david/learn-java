package com.S_JVA.badges;

import java.util.Scanner;

public class Deletingarray {

    // Method for returning array with removed number

    /**
     * This methods returns an array without the number given by the user
     * @param number Number that should be deleted on array
     * @param array Array targeted
     * @return Return an array without the number given by user
     */
    public static int [] removeNumber(int number, int [] array)
    {
        // Copying the array length
        int [] solution = new int[array.length];
        for (int i = 0; i < array.length; i++)
        {

            if (array[i] == number)
            {
                array[i] = array[i + 1];

            }
            // Copying array values
            solution[i] = array[i];
        }

        return solution;
    }



    // Method for printing array
    public static void printArray(int [] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("The " + i +" number is " + array[i]);
        }
    }

    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        int number [] = new int[5];
        System.out.println("Enter 5 values : ");
        for (int i = 0; i < number.length; i++)
        {
            number[i] = keyBoard.nextInt();
        }
        System.out.println("Please write a number and wil remove from the collection? ");
        int numberInput = keyBoard.nextInt();
        printArray(removeNumber(numberInput, number));
        keyBoard.close();
    }
}
