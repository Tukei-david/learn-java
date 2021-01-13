import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class arrayAndfiles {
    public static void main(String[] args) throws IOException
    {
        int [] values = new int[10];

        int i = 0;

        File file = new File("values.txt");

        if (file.exists())
        {
            Scanner inputFile = new Scanner(file);

            while (inputFile.hasNext() && i < values.length)
            {
                values[i] = inputFile.nextInt();
                i++;
            }
            inputFile.close();

            for (int value : values)
            {
                System.out.println(value);
            }
        }
        else
        {
            System.out.println("The file doesn't exist");
        }
    }
}
