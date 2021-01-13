import java.util.Scanner;

public class S_JVA_18
{

    public static void main(String[] args) {
        // Creating calculator system using switch statement
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        int firstNumber; // storing 1st number
        int secondNumber; // Storing 2nd number
        int inputSto;
        while (!exit)
        {
            try {
                System.out.println("Please enter \n 1: Sum \n 2: Divide \n 3: Multiply \n 4: Rest \n 5: Exit and Close");
                inputSto = input.nextInt();

                switch (inputSto)
                {
                    case 1:
                        // sum
                        System.out.println("Please put the first number:");
                        firstNumber = input.nextInt();
                        System.out.println("Please input the second number");
                        secondNumber = input.nextInt();
                        System.out.println("The solution is:");
                        System.out.println(firstNumber + secondNumber);
                        break;
                    case 2:
                        // Divide
                        System.out.println("Please put the first number:");
                        firstNumber = input.nextInt();
                        System.out.println("Please input the second number");
                        secondNumber = input.nextInt();
                        System.out.println("The solution is:");
                        try
                        {
                            System.out.println(firstNumber / secondNumber);
                        }
                        catch (ArithmeticException e)
                        {
                            System.out.println("Can't do that, Infinite");
                        }
                        break;
                    case 3:
                        // Multiply
                        System.out.println("Please put the first number:");
                        firstNumber = input.nextInt();
                        System.out.println("Please input the second number");
                        secondNumber = input.nextInt();
                        System.out.println("The solution is:");
                        System.out.println(firstNumber * secondNumber);
                        break;
                    case 4:
                        // Rest
                        System.out.println("Please put the first number:");
                        firstNumber = input.nextInt();
                        System.out.println("Please input the second number");
                        secondNumber = input.nextInt();
                        System.out.println("The solution is:");
                        System.out.println(firstNumber - secondNumber);
                        break;
                    case 5:
                        // Exit
                        exit = true;
                        break;
                    default:
                        System.out.println("Value out of range");
                        break;

                }
            } catch (Exception e) {
                System.out.println("Please enter a valid number:");
                input.next();
            }

        }

    }
}
