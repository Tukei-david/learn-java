package com.S_JVA.badges;
import java.util.Arrays;
import java.util.Scanner;

public class insertElementOnArray {

//    public static void addnumberOnindex(int number, int index, int [] array)
//    {
//        for (int i = array.length-1; i > index; i--)
//        {
//            array[i] = array[i-1];
//        }
//        array[index] = number;
//
//        System.out.println("New Array: "+Arrays.toString(array));
//    }
    public static void main(String[] args) {

        int[] my_array = new int[6];

        // Insert an element
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Input 6 values: ");
        for (int i = 0; i < my_array.length; i++)
        {
            my_array[i] = keyBoard.nextInt();
        }
        System.out.println("Please the value you want to insert:");
        int newValue = keyBoard.nextInt();
        System.out.println("Please input the position you want the element to be array (position start at 0):");
        int Index_position = keyBoard.nextInt();

        System.out.println("Original Array : "+Arrays.toString(my_array));

        for(int i=my_array.length-1; i > Index_position; i--){
            my_array[i] = my_array[i-1];
        }
        my_array[Index_position] = newValue;
        int newArrayLength[] = new int[my_array.length+1];
        for (int i = 0; 1 < my_array.length; i++)
        {
            newArrayLength[i] = my_array[i];
            System.out.println(newArrayLength[i]);
        }
//        for (int i =0; i<newArrayLength; i++)
//        {
//            System.out.println(my_array[i]);
//        }
        // System.out.println("New Array: "+Arrays.toString(my_array));
    }
}



