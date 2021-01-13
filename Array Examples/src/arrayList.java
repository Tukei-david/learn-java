import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // Adding value to specific index
        names.add("John");
        names.add("Peters");
        names.add("Ekai");
        names.add("Paul");
        names.add("Ejikon");

        // Printing put the array list
        for (int i = 0; i <names.size(); i++)
        {
            System.out.println(names.get(i));
        }

    }
}
