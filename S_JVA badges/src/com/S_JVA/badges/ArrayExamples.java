package com.S_JVA.badges;

public class ArrayExamples {

    // Create method to reverse the order
    public static String [] arrayReverseOrder(String [] array)
    {
        // Copy the array length to the solution
        String [] solution = new String[array.length];
        int indexFisrt = 0;
        int indexLast = array.length - 1;

        while (indexFisrt < array.length)
        {
            solution[indexFisrt] = array[indexLast];
            indexFisrt++;
            indexLast--;
        }
        return solution;
    }

    // For printing out all the values in the array
    public static void arrayProperties(String [] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("The values for the array in reversed order is: " + array[i]);
        }
    }

    // Creating football table array
    public static void main(String[] args) {
        String footballTeams [] = {"Manchester United", "Arsenal", "liverpool", "Manchester City", "Chelsea"};
        arrayProperties(footballTeams);
        arrayProperties(arrayReverseOrder(footballTeams));
    }
}
