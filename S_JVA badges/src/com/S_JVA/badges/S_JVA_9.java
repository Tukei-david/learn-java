//Here starts the class
public class S_JVA_9
{
    /**
     * These methods returns a statement to show if number is + 0 or -
     * @param number number targted to be evaluated
     * @return returns the strings after evaluation
     */
    public static String check(int number){
        String solution = "";
        //Your code here
        if (number < 0)
        {
            solution = "Negative";
        }
        else if (number == 0)
        {
            solution = "Zero";
        }
        else if (number > 0)
        {
            solution = "positive";
        }
        return solution;
    }
    
    //Here is the main method, the first method
    //tyhat will run when you start the program
    public static void main (String [] args) {
        //This is for testing your function when you run main(String [] args), but it should work for any value
        
        System.out.println("The number 9 is: ");
        //This order should write "Positive"
        System.out.println(check(9));
       
        System.out.println("The number -6 is: ");
        //This order should write "Negative"
        System.out.println(check(-6));
        
        System.out.println("The number 0 is: ");
        //This order should write "Zero"
        System.out.println(check(0));
        
        
    }
}
