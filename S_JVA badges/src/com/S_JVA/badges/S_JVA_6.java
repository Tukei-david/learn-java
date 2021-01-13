//Here starts the class
public class S_JVA_6
{
    /* This function should return the day of the week */

    /**
     * Creating method for getting the name of the day
     * @param number Number that will be checked if it ranges between 1 and 7
     * @return dayName variable to get the name of the day
     */
    public static String week(int number){
        //Your code here
        String dayName = "";
        if (number >= 1 && number <= 7)
        {
            if (number == 1)
            {
                dayName = "Monday";
            }
            else if (number == 2)
            {
                dayName = "Tuesday";
            }
            else if (number == 3)
            {
                dayName = "Wensday";
            }
            else if (number == 4)
            {
                dayName = "Thursday";
            }
            else if (number == 5)
            {
                dayName = "Friday";
            }
            else if (number == 6)
            {
                dayName = "Saturday";
            }
            else if (number == 7)
            {
                dayName = "Sunday";
            }
        }
        else
        {
            System.out.println("Out of range!");
        }
        return dayName;
    }
    
    //Here is the main method, the first method
    //tyhat will run when you start the program
    public static void main (String [] args) {
        //This is for testing your function when you run main(String [] args), but it should work for any value
        
        System.out.println("The number 4 is: ");
        //This order should write "Thursday"
        System.out.println(week(4));
       
        System.out.println("The number -6 is: ");
        //This order should write "Saturday"
        System.out.println(week(-6));
        
        System.out.println("The number 10 is: ");
        //This order should write "Out of range"
        System.out.println(week(0));
        
        
    }
}
