public class S_JVA_19
{
    /**
     * These methods prints the day od week
     * @param day Number of day entered by user
     */
    public static void dayWeek(int day){
       //Your code here
        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of range");
        }
    }

    public static void main (String [] args) {
        //This is for testing your function when you run main(String [] args), but it should work for any value

        System.out.println("The day 1 is: ");
        //This order should write "Monday"
        try {
            dayWeek('n');
        }catch (Exception e){
            System.out.println("Invalid number");
        }

        System.out.println("The day 3 is: ");
        //This order should write "Wednesday"
        try {
            dayWeek(3);
        }catch (Exception e){
            System.out.println("Invalid number");
        }

        System.out.println("The day 7 is: ");
        //This order should write "Sunday"
        try {
            dayWeek(7);
        }catch (Exception e){
            System.out.println("Invalid number");
        }

        System.out.println("The day 0 is: ");
        //This order should write "Out of range"
        try {
            dayWeek(0);
        }catch (Exception e){
            System.out.println("Invalid number");
        }

        System.out.println("The day 8 is: ");
        //This order should write "Out of range"
        try {
            dayWeek(8);
        }catch (Exception e){
            System.out.println("Invalid number");
        }
        
    }
}
