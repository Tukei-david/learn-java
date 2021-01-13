import java.util.Arrays;
import java.util.Scanner;

public class S_JVA_34
{
   //Here your code
    public static void removeEvenNumber(int [] number)
    {
        int arrSize = number.length;
        for (int i = 0; i < arrSize; i++)
        {
            if (number[i] % 2 == 0)
            {
                int newArrSize = arrSize -1;
                number[i] = number[i+1];


            }
        }
    }

    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Input the size/length of array: ");
        int arrayLength = keyBoard.nextInt();
        int array[] = new int[arrayLength];
        System.out.println("Input the array values: ");
        for (int i = 0; i < arrayLength; i++)
        {
            array[i] = keyBoard.nextInt();
        }
        System.out.println("The original array: " + Arrays.toString(array));
        removeEvenNumber(array);
    }
}
