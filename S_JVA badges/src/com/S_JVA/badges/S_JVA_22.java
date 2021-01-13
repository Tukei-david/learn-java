import java.util.*;
public class S_JVA_22
{
    // Checks the longest word
    public static void main (String [] args) {

        String firstWord;
        String secondWord;
        String ThirdWord;
        //This is for testing your function when you run main(String [] args), but it should work for any value
        Scanner tec = new Scanner(System.in);
        //Your code here
        System.out.println("Please write your first word: ");
        firstWord = tec.nextLine();
        System.out.println("Please Write your second word: ");
        secondWord = tec.nextLine();
        System.out.println("Please write your third word: ");
        ThirdWord = tec.nextLine();


        String longestWord = firstWord;
        if (secondWord.length() > longestWord.length())
        {
            longestWord = secondWord;
            System.out.println(longestWord);
        }else if (ThirdWord.length() > longestWord.length())
        {
            longestWord = ThirdWord;
            System.out.println(longestWord);
        }else
        {
            System.out.println(longestWord);
        }
        // What if they are equal?
        // Checking the longest word using the if else method and length() method
//        if (firstWord.length() > secondWord.length() && firstWord.length() > ThirdWord.length())
//        {
//            System.out.println("The longest word is:");
//            System.out.println(firstWord);
//        }
//        else if (secondWord.length() > firstWord.length() && secondWord.length() > ThirdWord.length())
//        {
//            System.out.println("The longest word is:");
//            System.out.println(secondWord);
//        }
//        else
//        {
//            System.out.println("The longest word is:");
//            System.out.println(ThirdWord);
//        }
    }
}
