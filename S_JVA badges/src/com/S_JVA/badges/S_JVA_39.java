import java.util.Scanner;

public class S_JVA_39
{
   //Here your code

    /**Simple game but will finalize it
     * These method checks if number is in the array or not
     * @param array The array where the number will be checked if present ot not
     * @param index Checked on this index
     * @param number Number input by user
     * @return solution if present or not
     */
    public static String  checkNumber(int [] array, int index, int number)
    {
        String solution = " ";
        for (int i = 0; i < array.length; i++)
        {
            if (number == array[i])
            {
                index = 1;
            }
        }
        if (index == 1)
        {
            System.out.println(" Congratulation! Number is present");
        }else {
            System.out.println("Sorry number is not present!! Try again");
        }

        return solution;
    }

    // The main method
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        try {
            int number;
            int indexPosition = 0;
            int chancesGiven = 1;
            int array[] = {12, 34, 4466, 34, 2, 4424, 2334, 22, 23, 43, 65, 67, 43, 232, 8, 565, 5};
            for (int i = 0; i < array.length; i++) {
                indexPosition = array[i];
            }


            System.out.println("You have 5 chances only. Find three correct and win");

            while (chancesGiven <= 5) {
                System.out.println("Please input a number to win: ");
                number = keyBoard.nextInt();

                checkNumber(array, indexPosition, number);
                chancesGiven++;
            }
        } catch (Exception e)
        {
            System.out.println("invalid value");
        }
    }
}