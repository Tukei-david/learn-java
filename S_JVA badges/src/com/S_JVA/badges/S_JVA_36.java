import java.util.Arrays;
import java.util.Scanner;

public class S_JVA_36
{
   //Here your code

    /**
     * These method prints the third largest value in array
     * @param number Array targeted
     */
    public static void printThirdLargestNumber(int [] number)
    {
        int high;
        int size = number.length;
        for (int i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (number[i] > number[j])
                {
                    high = number[i];
                    number[i] = number[j];
                    number[j] = high;
                }
            }


        }
        System.out.println("Third largest number is: " + number[size-3]);
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
            printThirdLargestNumber(array);
        } catch (Exception e)
        {
            System.out.println("Invalid value");
        }

    }
}
