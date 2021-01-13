
public class S_JVA_7
{
    /**
     * Create method to determine the age
     * @param number Stroing age input which will be defined to either of genres(No negative number)
     * @return output variable that stores the four genres
     */
    public static String age(int number){
        //Your code here
        String outPut = "";

        // Creating if staement to check the condition.
        if (number <= 0)
        {
            outPut = "Out of range!";
        }
        else if (number >= 1 && number < 18)
        {
            outPut = "Underage";
        }
        else if (number >= 18 && number <= 30)
        {
            outPut = "Young";
        }
        else if (number >= 31 && number <= 65)
        {
            outPut = "Adult";
        }
        else
        {
            outPut = "old";
        }
        return outPut;
    }
    
    
    public static void main (String [] args) {
        //This is for testing your function when you run main(String [] args), but it should work for any value
        
        System.out.println("If you have -1 years old, you are: ");
        //This order should write "Underage"
        System.out.println(age(-1));
       
        System.out.println("If you have 19 years old, you are: ");
        //This order should write "Young"
        System.out.println(age(19));
        
        System.out.println("If you have 31 years old, you are: ");
        //This order should write "Adult"
        System.out.println(age(31));
        
        System.out.println("If you have 67 years old, you are: ");
        //This order should write "Old"
        System.out.println(age(67));
        
        
    }
}
