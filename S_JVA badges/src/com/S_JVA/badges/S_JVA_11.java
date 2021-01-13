import javax.swing.*;

public class S_JVA_11
{
    /**
     * These methods checks if number is odd or eve
     * @param number number targetd to be evaluated
     */
    public static void evenOrOdd(int number){
       //Your code here
        if ((number%2) == 0)
        {
            System.out.println("The number is Even");
        }
        else
        {
            System.out.println("The number is Odd");
        }
    }

    public static void main (String [] args) {
        //This is for testing your function when you run main(String [] args), but it should work for any value

        System.out.println("The number is 1: ");
        //This order should write "The number is Odd"
        evenOrOdd(1);
        
         System.out.println("The number is 34: ");
        //This order should write "The number is Even"
        evenOrOdd(34);
        
         System.out.println("The number is 9: ");
        //This order should write "The number is Odd"
        evenOrOdd(9);
        
         System.out.println("The number is 40: ");
        //This order should write "The number is Even"
        evenOrOdd(40);
        
         System.out.println("The number is 37: ");
        //This order should write "The number is Odd"
        evenOrOdd(37);
        
    }
}
