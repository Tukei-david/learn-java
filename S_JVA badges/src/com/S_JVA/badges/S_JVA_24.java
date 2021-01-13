import java.util.*;
public class S_JVA_24
{
    /**
     * These method checks the number of characters in a sentence
     * @param sentInput sentences input
     * @return sentNum number of characters
     */
    public static int stringChecker(String sentInput){
       //Your code here
        int sentNum;
        sentNum = sentInput.length();
        return sentNum;
    }

    public static void main (String [] args) {
        //This is for testing your function when you run main(String [] args), but it should work for any value
        Scanner tec = new Scanner(System.in);
        //Your code here
        System.out.println("Please write down one sentence: ");
        String sentence = tec.nextLine();
        System.out.println("Your sentence contains " + stringChecker(sentence) + " characters");
    }
}
