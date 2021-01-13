import java.util.Arrays;
import java.util.Scanner;

public class S_JVA_38
{
   //Here your code
    public static void duplicateNumberOnEven(int [] number)
    {
        int indexPosition;
        int length = number.length;
        int newArray[] = null;
        // Run through the array
        for (indexPosition = 0; indexPosition < length; indexPosition++ )
        {
            if (indexPosition%2 == 0)
            {
                newArray = new int[length+1];
                // Copying the values
                for (int i = 0; i < length; i++)
                {
                    newArray[i] = number[i];
                }
                // Creating space
                for (int i = (newArray.length-1); i > indexPosition; i--)
                {
                    newArray[i] = newArray[i - 1];
                }
            }
        }

        for (int i = 0; i < newArray.length; i++)
        {
            System.out.println(newArray[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Input the size/length of array: ");
        int arrayLength = keyBoard.nextInt();
        int array[] = new int[arrayLength];
        System.out.println("Input the array values: ");
        for (int i = 0; i < arrayLength; i++)
        {
            array[i] = keyBoard.nextInt();
        }
        System.out.println("The original array: " + Arrays.toString(array));
        duplicateNumberOnEven(array);
    }
}
