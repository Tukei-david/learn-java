import java.util.Arrays;
import java.util.Scanner;

public class S_JVA_31
{
   //Here your code

    /**
     * Method for adding number on the beginning of array
     * @param number Number targeted to be added on the array
     * @param array Array targeted
     * @return numberArray with element added on the beginning
     */
    public static void Addnumber(int number, int [] array)
    {
        int [] newNumberArray = new int[array.length + 1];
        int index = 0;
        // Copying te values to the new array
        for (int i =0; i<array.length; i++)
        {
            newNumberArray[i] = array[i];
        }
        //Creating space on position 0 in new array
        for (int i = (newNumberArray.length-1); i > index; i-- )
        {
            newNumberArray[i] = newNumberArray[i-1];
        }
        newNumberArray[index] = number;

        // Printing the new array
            System.out.println("The new values are" + Arrays.toString(newNumberArray));

    }


   public static void main(String[] args) {
       Scanner keyBoard = new Scanner(System.in);
       int numberArray[] = new int[5];
       try {
           System.out.println("Input 5 values below: ");
           for (int i = 0; i < numberArray.length; i++) {
               numberArray[i] = keyBoard.nextInt();
           }
           System.out.println("Input a number to add on first element of array");
           int numberInput = keyBoard.nextInt();
           Addnumber(numberInput, numberArray);
       } catch (Exception e)
       {
           System.out.println("Numeric value only");
           keyBoard.next();
       }
   }
}
