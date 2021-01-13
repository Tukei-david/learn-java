package com.reading.use.input.scanner;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your first number? ");
        firstNumber = keyboard.nextInt();

        System.out.print("What is your second number?");
        secondNumber = keyboard.nextInt();

        double average = (firstNumber + secondNumber) / 2.0;

        System.out.print("The average is: " + average);

        String name;
        String surname;

        keyboard.nextLine();
        System.out.print("What is your first name?");
        name = keyboard.nextLine();

        System.out.print("What is your surname?");
        surname = keyboard.nextLine();

        System.out.print("Your name are " + name + " " + surname);

    }
}
