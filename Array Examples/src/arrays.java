public class arrays {
    public static void main(String[] args) {

        // Declaring a variable one by one
        int [] numbers = new int[4];

        numbers[0] = 10;
        numbers[1] = 15;
        numbers[2] = 20;
        numbers[3] = 25;

        // Declaring variable in one line
        int [] numbersS2 = {10, 20, 30, 40};

        for ( int value = 0; value < numbers.length; value++)
        {
            System.out.println(numbers[value]);
        }

        System.out.println();

        // Enhanced for loop for typing values in arrays
        for (int i : numbersS2)
        {
            System.out.println(i);
        }
    }
}
