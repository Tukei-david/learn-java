import java.util.Arrays;
import java.util.Scanner;

public class S_JVA_30
{
    /**
     * These methods add an element on specified index by use
     * @param number new value entered
     * @param index Index specified
     * @param array The array that will reduce by one
     */
    public static void addNumberOnIndex(int number, int index, int [] array)
    {
        int arraySolution[] = new int[array.length+1];
        // Copying the values to the new array
        for (int i = 0; i < array.length; i++)
        {
            arraySolution[i] = array[i];
        }
        // Creating space on te index specified
        for (int i = (arraySolution.length-1); i > index; i--)
        {
            arraySolution[i] = arraySolution[i-1];
        }
        // Restoring the value to the indec specified
        arraySolution[index] = number;

        // Printing the last array with one number added
        System.out.println("The last value in array: " + Arrays.toString(arraySolution));
    }




    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        int number [] = new int[5];
        int max = 5;
        try {
            System.out.println("Please insert 5 values below: ");
            for (int i = 0; i < max; i++) {
                number[i] = keyBoard.nextInt();
            }
            System.out.println("Please input the number you want to add on the array");
            int numberInput = keyBoard.nextInt();
            System.out.println("Please input the index where you want the number to be positioned?");
            int numberPosition = keyBoard.nextInt();
            // Printing the original array
            System.out.println("The Original value in array: " + Arrays.toString(number));
            addNumberOnIndex(numberInput, numberPosition, number);
            keyBoard.close();
        } catch (Exception e)
        {
            System.out.println("Numeric values only");
        }

    }
}
