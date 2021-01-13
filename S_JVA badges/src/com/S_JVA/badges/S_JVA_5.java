import javax.swing.*;

//Here starts the class
public class S_JVA_5
{
    /* This function should return the max of the 2 numners */
    public static void max(int number1, int number2){
        //Your code here
        if (number1 > number2)
        {
            System.out.println(number1);
        }
        else
        {
            System.out.println(number2);
        }
    }
    
    //Here is the main method, the first method
    //tyhat will run when you start the program
    public static void main (String [] args) {
        //This is for testing your function when you run main(String [] args), but it should work for any value
        
        //This order should write "9"
        max(8,9);
        
         //This order should write "11"
        max(11,10);
        
    }
}
