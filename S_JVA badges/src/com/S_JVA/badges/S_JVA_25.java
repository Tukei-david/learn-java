import java.lang.reflect.Array;
import java.util.*;
public class S_JVA_25
{
    /**
     * These methods returns the square root of a number
     * @param number Value that will be square roote
     * @return The solution after perfoming the method
     */
    public static double squareRoot(double number){
       //Your code here
        double solution;
        solution = Math.sqrt(number);
        return solution;
    }

    public static void main (String [] args) {
        // Ask user for number
        boolean exit = false;
        Scanner tec = new Scanner(System.in);
        while (!exit)
        {
            try {
                System.out.println("Please write a number and i will return the rooted value: And press 0 to exit");
                double numberInput = tec.nextInt();
                if (numberInput != 0)
                {
                    System.out.println(squareRoot(numberInput));
                }
                else
                {
                    exit = true;
                }
            } catch (Exception e)
            {
                System.out.println("Numeric value only please");
                tec.next();
            }
        }
    }
}
