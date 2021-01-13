import java.util.Arrays;
import java.util.Scanner;

public class S_JVA_32
{
    /**
     *These method check if an array has repreated number or not
     * @param number Array evaluated
     */
    public static void checkReapetedNumber(int [] number)
    {
        int count = 0;
        // Run through the array
        for (int i = 0; i < number.length; i++)
        {
            // Checking the values
            for (int j = i+1; j < number.length; j++)
            {
                if (number[i] ==  (number[j]))
                {
                    count = 1;
                }
            }
        }
        if (count == 1)
        {
            System.out.println("Repeated elements in array");
        }
        else {
            System.out.println("No repeated elements in array");
        }
    }

    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        int numberArray[] = new int[5];
        try {
            System.out.println("Enter 5 values: ");
            for (int i = 0; i <numberArray.length; i++)
            {
                numberArray[i] = keyBoard.nextInt();
            }
            // Check if the number has repeated numbers or not
            checkReapetedNumber(numberArray);
        } catch (Exception e)
        {
            System.out.println("Numeric value only");
        }


    }
}
