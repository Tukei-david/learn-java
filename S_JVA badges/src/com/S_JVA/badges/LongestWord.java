package com.S_JVA.badges;

import java.util.Scanner;

public class LongestWord {

    public static String findLongWord(String Sentence)
    {
        String solution = " ";
        int positionWhiteSpace = 0;
        int nextPositionWhiteSpace = 0;

        while (positionWhiteSpace <= Sentence.length())
        {
            // For getting next white space in te sentence
            nextPositionWhiteSpace = Sentence.indexOf(" ", positionWhiteSpace+1);
            // if it doesn't find another space it returns -1 we do
            if (nextPositionWhiteSpace == -1)
            {
                String possibleWord = Sentence.substring(positionWhiteSpace, Sentence.length());
                // if possible word is bigger than the last one, we change it to solution
                if (possibleWord.length() >= solution.length())
                {
                    solution = possibleWord;
                    return solution;
                }
            }

            // Getting the substring from between space and check if they are bigger than the solution
            String possibleWord = Sentence.substring(positionWhiteSpace, nextPositionWhiteSpace);
            // Check if it is bigger than the solution
            if (possibleWord.length() > solution.length())
            {
                solution = possibleWord;
            }

            // The next position found will be equivalent to positionWhiteSpace variable and the next white space will
            // nextPositionWhiteSpace variable as it adds by 1
            positionWhiteSpace = nextPositionWhiteSpace;
        }

        return solution;
    }


    public static void main(String[] args) {
        // For reading user typed input
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Please write a sentence and i will return a bigger word: ");
        String inputSent = keyBoard.nextLine();
        // Print out the longest word
        System.out.println("The longest word is: " + findLongWord(inputSent));
    }
}
