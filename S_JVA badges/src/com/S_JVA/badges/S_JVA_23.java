import java.util.*;
public class S_JVA_23
{
    /**
     * These methods prints out the multiplication of number
     * @param number number targeted
     * @return The solution after multiplication
     */
    public static int multplicatinNum(int number){
       //Your code here
        int solution;
        solution = number * number;

        return solution;
    }

    public static void main (String [] args) {
        //This is for testing your function when you run main(String [] args), but it should work for any value
        Scanner tec = new Scanner(System.in);
        //Your code here
        boolean exit = false;

        while (!exit)
        {
            try {
                System.out.println("Please write any number between 0 and 9: Press 99 to exit");
                int number = tec.nextInt();

                // Use if else to check number if it lies between 0 and 9
                if (number >= 0 && number <= 9)
                {
                    System.out.println("Its multiplication solution is: " + multplicatinNum(number));
                }
                else if (number == 99)
                {
                    exit = true;
                }
                else
                {
                    System.out.println("The number is not on range");
                }
            } catch (Exception e)
            {
                System.out.println("Invalid number");
                tec.next();
            }
        }

    }
}
