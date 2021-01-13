public class S_JVA_10
{
    /**
     * These metods checks a number if it is + or -
     * @param number number tragetd to be evaluated
     */
    public static void isPositive(int number){
       //Your code here
        if (number < 0)
        {
            System.out.println("The number is Negative");
        }
        else if (number == 0)
        {
            System.out.println("The number is Zero");
        }
        else if (number > 0)
        {
            System.out.println("The number is positive");
        }
    }

    public static void main (String [] args) {
        //This is for testing your function when you run main(String [] args), but it should work for any value
        
        System.out.println("The number is -1: ");
        //This order should write "The number is Negative"
        isPositive(-1);
        
         System.out.println("The number is 34: ");
        //This order should write "The number is Postive"
        isPositive(34);
        
         System.out.println("The number is -9: ");
        //This order should write "The number is Negative"
        isPositive(-9);
        
         System.out.println("The number is 0: ");
        //This order should write "The number is zero"
        isPositive(-0);
        
         System.out.println("The number is 32: ");
        //This order should write "The number is Positive"
        isPositive(32);
        
    }
}
