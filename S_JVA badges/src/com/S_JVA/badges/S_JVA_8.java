//Here starts the class
public class S_JVA_8
{

    /**
     * These methods return the maximum number between the 3 numbers
     * @param number1 number one
     * @param number2 number two
     * @param number3 number three
     * @return returns the maximum number
     */
    public static int max(int number1, int number2, int number3){
        //Your code here

        int highestNumber = number1;

        if (number2 > highestNumber)
        {
            highestNumber = number2;
        }
        else if (number3 > highestNumber)
        {
            highestNumber = number3;
        }
        else {
            return highestNumber;
        }

        return highestNumber;
    }

    public static int min(int number1, int number2, int number3)
    {
        if (number1 < number2 && number1 < number3){ return number1; }
        else if (number2 < number1 && number2 < number3) {return number2;}
        else if (number3 < number2 && number3 < number2){ return number3; }else {
            System.out.println("The numbers are equals");}
        return -1;
    }
    
    //Here is the main method, the first method
    //tyhat will run when you start the program
    public static void main (String [] args) {
        //This is for testing your function when you run main(String [] args), but it should work for any value
        
        System.out.println("The maximun between 1, 2 and 3 is: ");
        //This order should write "3"
        System.out.println(max(1,2,3));
        System.out.println("The minimun between 1, 2 and 3 is: ");
        //This order should write "1"
        System.out.println(min(1,2,3));
        
        System.out.println("The maximun between 67, 23 and 33 is: ");
        //This order should write "67"
        System.out.println(max(67,23,33));
        System.out.println("The minimun between 67, 23 and 33 is: ");
        //This order should write "23"
        System.out.println(min(67,23,33));
        
        System.out.println("The maximun between 11, 25 and 13 is: ");
        //This order should write "25"
        System.out.println(max(11,25,13));
        System.out.println("The minimun between 11, 25 and 13 is: ");
        //This order should write "11"
        System.out.println(min(11,25,13));
        
        
    }
}
