 public class sumAndaverage {
    public static void main(String[] args) {
        int [] numbers = {2, 4, 45, 46, 23, 24};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            sum = sum + numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
    }
}
