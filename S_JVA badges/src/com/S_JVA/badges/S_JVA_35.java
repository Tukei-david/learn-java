import java.util.Arrays;
import java.util.Scanner;

public class S_JVA_35
{
   //Here your code
    public static void printLargestNumber(int [] number)
    {
        int largeNumber = number[0];
        for (int i = 0; i < number.length; i++)
        {
            if (number[i] > largeNumber)
            {
                largeNumber = number[i];
            }
        }
        System.out.println("The biggest values is: " + largeNumber);

    }
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        try {
            System.out.println("Input the size/length of array: ");
            int arrayLength = keyBoard.nextInt();
            int array[] = new int[arrayLength];
            System.out.println("Input the array values: ");
            for (int i = 0; i < arrayLength; i++)
            {
                array[i] = keyBoard.nextInt();
            }
            System.out.println("The original array: " + Arrays.toString(array));
            printLargestNumber(array);
        } catch (Exception e)
        {
            System.out.println("Invalid value");
        }

    }
}
