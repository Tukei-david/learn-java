import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class S_JVA_21
{
   // Prints out the age of person
    public static void main (String [] args) {
        int dateOfBirth;
        int monthOfBirth;
        int yearOfBirth;
        int count = 1;
        Scanner tec = new Scanner(System.in);
        do {
            try {
                System.out.println("Please input the day you were born");
                dateOfBirth = tec.nextInt();
                System.out.println("Please input the month you were born");
                monthOfBirth = tec.nextInt();
                System.out.println("Please input the year you were born");
                yearOfBirth = tec.nextInt();

                // Store the date of birth in a variable
                LocalDate birthDate = LocalDate.of(yearOfBirth,monthOfBirth,dateOfBirth);

                // Getting the current date
                LocalDate currentDate = LocalDate.now();

                // Getting the period between the two dates
                Period Years = Period.between(birthDate,currentDate);

                // Showing the user age
                System.out.println("Your age is " +
                        Years.getYears() +" Years " + Years.getMonths() + " Months and " + Years.getDays() + " Days");
                count = 2;
            }catch (Exception e) {
                System.out.println("Please input the correct value");
                tec.next();
            }
        }while (count == 1);

    }
}
