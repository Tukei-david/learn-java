package com.S_JVA.badges;

import java.util.Scanner;

public class DeletingElementOnArray {

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

        for (int i = 0; i < arraySolution.length; i++) {
            System.out.println(arraySolution[i]);
        }
    }

    public static void main(String[] args) {
        int number[] = new int[5];
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Enter 5 values below: ");
        for (int i = 0; i<number.length; i++)
        {
            number[i] = keyBoard.nextInt();
        }
        // Printing the values
        System.out.println("The values of original array are: ");
        for (int i = 0; i<number.length; i++)
        {
            System.out.println(number[i]);
        }
        System.out.println("Input the value to remove: ");
        int input = keyBoard.nextInt();


        // Removing the input number
        removeElement(input, number);
    }
}
