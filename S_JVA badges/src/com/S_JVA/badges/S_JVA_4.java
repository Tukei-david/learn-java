import javax.swing.*;

//Here starts the class
public class S_JVA_4
{
    /* This function should return the element + 1 */
    public static void plusOne(int number){
        //Your code here
        int solution;
        solution = number + 1;

        System.out.println(solution);
    }
    
    //Here is the main method, the first method
    //tyhat will run when you start the program
    public static void main (String [] args) {
        //This is for testing your function when you run main(String [] args), but it should work for any value
        
        //This order should write "9"
        plusOne(8);
        
         //This order should write "11"
        plusOne(10);

         //This order should write "16"
        plusOne(15);

         //This order should write "158"
        plusOne(157);
        
    }
}
