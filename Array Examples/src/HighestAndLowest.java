public class HighestAndLowest {
    public static void main(String[] args) {
        int [] number = {2, 4, 5, 6, 7, 40, 4, 3};

        int highest = number[0];

        for (int i = 1; i < number.length; i++)
        {
            if (number[i] > highest)
            {
                highest = number[i];
            }
        }

        System.out.println("The highest number is: " + highest);

        int lowest = number[0];

        for (int i = 0; i < number.length; i++)
        {
            if (number[i] < lowest)
            {
                lowest = number[i];
            }
        }

        System.out.println("The lowest number is: " + lowest);
    }
}
