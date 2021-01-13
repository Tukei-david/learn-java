package com.S_JVA.badges;

import java.util.Arrays;

public class evenNumber {

    public static int [] removeEvenNumber(int [] number)
    {
        // Create new array
        int [] newArray = new int[number.length];
        int index = 0;
        for (int i = 0; i < number.length; i++)
        {
            newArray[index] = number[i];
            index++;

            if (newArray[index] % 2 == 0)
            {
                newArray[index] = newArray[index + 1];
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int [] array = {13, 10, 15, 12, 19};
        System.out.println("The original array values: " + Arrays.toString(array));
        removeEvenNumber(array);
    }
}
