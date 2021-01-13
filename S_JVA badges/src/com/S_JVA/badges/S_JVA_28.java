package com.S_JVA.badges;

import java.util.Arrays;
import java.util.Scanner;

public class S_JVA_28 {

    /**
     * These method remove element on array
     * @param number number targetd to be removed on array
     * @param array array targted
     */
    public static void removeElement(int number, int [] array) {
        int arraySolution[] = null;
        int arrayLength = array.length;

        for (int i = 0; i < arrayLength; i++) {
            if (array[i] == number) {
                arraySolution = new int[(arrayLength - 1)];
                // Copying the values to the new array
                for (int index = 0; index < i; index++) {
                    arraySolution[index] = array[index];
                }
                // Deleting the value on the index position and replacing it with next value
                for (int j = i; j < (arrayLength - 1); j++) {
                    arraySolution[j] = array[j + 1];
                }
                break;
            }
        }
        System.out.println("New array values: " + Arrays.toString(arraySolution));
    }

    public static void main(String[] args) {
        int number[] = new int[5];
        Scanner keyBoard = new Scanner(System.in);
        try {
            System.out.println("Enter 5 number values below: ");
            for (int i = 0; i<number.length; i++)
            {
                number[i] = keyBoard.nextInt();
            }
        }catch (Exception e)
        {
            System.out.println("Numeric value only");
            keyBoard.next();
        }

        // Printing the values
        System.out.println("The values of original array are: " + Arrays.toString(number));
        try {
            System.out.println("Input the value to remove: ");
            int input = keyBoard.nextInt();


            // Removing the input number
            removeElement(input, number);
        }catch (Exception e) {
            System.out.println("Numeric value only");
            keyBoard.next();
        }

    }
}
