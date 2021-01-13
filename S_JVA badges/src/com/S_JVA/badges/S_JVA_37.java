import java.util.Arrays;
import java.util.Scanner;

public class S_JVA_37
{
   //Here your code
    public static void returnAverage(int [] number)
    {
        double Average = 0;
        int sum = 0;
        for (int i = 0; i < number.length; i++)
        {
            sum = sum + number[i];
            // Finding average in the array
            Average = sum / number.length;
        }



        System.out.println("The average is: " + Average);

    }

    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        try {
            System.out.println("Input the size/length of array: ");
            int arrayLength = keyBoard.nextInt();
            int array[] = new int[arrayLength];
            System.out.println("Input the array values: ");
            for (int i = 0; i < arrayLength; i++) {
                array[i] = keyBoard.nextInt();
            }
            System.out.println("The original array: " + Arrays.toString(array));
            returnAverage(array);
        } catch (Exception e)
        {
            System.out.println("Invalid value");
        }

    }
}
