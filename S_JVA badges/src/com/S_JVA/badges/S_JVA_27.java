import java.util.*;
public class S_JVA_27
{
    //Your code here

    /**
     * These mehods checks if the number is present on the array or not
     * @param number The number that will be checked on the array
     * @param array Represent an array
     * @return Returns if it is false or true
     */
    public static boolean checkNumbers(int number, int [] array)
    {

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == number)
            {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int number[] = {2, 4, 5, 6, 4, 6, 64, 343};
        Scanner keyBoard = new Scanner(System.in);
        try {
            System.out.println("Please write any number to check if it is present on our numbers: ");
            int numberInput = keyBoard.nextInt();
            boolean isPresent = checkNumbers(numberInput, number);
            if (isPresent) {
                System.out.println("The number is present");
            } else {
                System.out.println("The number is not present");
            }
        }catch (Exception e) {
            System.out.println("Numeric value only");
            keyBoard.next();
        }
    }
}
