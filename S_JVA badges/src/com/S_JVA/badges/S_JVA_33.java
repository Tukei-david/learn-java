import java.util.Arrays;
import java.util.Scanner;

public class S_JVA_33
{
   //Here your code

    /**
     * These method should remove duplicate number from an array
     * @param number Array evaluated on the method
     */
    public static void removeDuplicateNumber(int [] number)
    {
        int arrayLength = number.length;
        for (int i = 0; i < (arrayLength-1); i++)
        {
            for (int j = i + 1; j < arrayLength; j++)
            {
                // Checking if they are equal
                if (number[i] == number[j])
                {
                    number[j] = number[arrayLength-1];
                    i++;
                }
            }
        }
        // The last value printed becouse of the loop condition
        for (int i = 0; i < (arrayLength-1); i++)
        {
            System.out.println(number[i] + " ");
        }
    }

   public static void main(String[] args) {
       Scanner keyBoard = new Scanner(System.in);
       int numberArray[] = new int[6];
       System.out.println("Enter 6 values with at least one number should be duplicate");
       for (int i = 0; i < numberArray.length; i++)
       {
           numberArray[i] = keyBoard.nextInt();
       }
       System.out.println("Original array: " + Arrays.toString(numberArray));
       removeDuplicateNumber(numberArray);

   }
}
