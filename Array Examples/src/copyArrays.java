public class copyArrays {
    public static void main(String[] args) {
        int [] numberS1 = {2, 4, 5, 6, 7, 8, 9};
        int [] numberS2 = new int[numberS1.length];

        for (int i = 0; i < numberS1.length; i++)
        {
            numberS2[i] = numberS1[i];
        }

        printArray(numberS1);
        System.out.println();
        printArray(numberS2);
    }


    // Define method for printing out array
    public static void printArray(int [] array)
    {
        for (int value : array)
        {
            System.out.println(value);
        }
    }
}
