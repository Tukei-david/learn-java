import java.util.Scanner;

public class S_JVA_29
{
   //Here your code

    /**
     * These method printsthe lastvalue in the array
     * @param array array targted values
     */
    public static void printLastValue(int [] array)
    {
        int lastValue = 0;
        for (int i =0; i < array.length; i++)
        {
            lastValue = (array.length-1);
        }
        System.out.println("The last value is " + array[lastValue]);
    }

   public static void main(String[] args) {
       Scanner keyBoard = new Scanner(System.in);
       int number [] = new int[5];
       try {
           System.out.println("Enter 5 values: ");
           for (int i = 0; i < number.length; i++) {
               number[i] = keyBoard.nextInt();
           }

           // Printing the last value
           printLastValue(number);
       }catch (Exception e)
       {
           System.out.println("Numeric values only");
            keyBoard.next();
       }

   }
}
