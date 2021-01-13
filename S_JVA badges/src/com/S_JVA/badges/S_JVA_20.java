import java.util.*;
public class S_JVA_20
{

    public static void main (String [] args) {
        //This is for testing your function when you run main(String [] args), but it should work for any value
        boolean exit = false;
        Scanner tec = new Scanner(System.in);
        // use while statement to loop through the condition until it ends
        while (!exit)
        {
            try
            {
                System.out.println("Please input the day number you what to know: Press 0 to exit");
                int dayNumber = tec.nextInt();
                switch (dayNumber) {
                    case 0:
                        exit = true;
                        break;
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
                        break;
                }
            }catch (Exception e) {
                System.out.println("Please input the correct value");
                tec.next();
            }
        }
        
    }
}
