public class arraysAndstrings {
    public static void main(String[] args) {
        String [] names = getNames();

        for (int i = 0; i < names.length; i++)
        {
            if (names[1] != null)
            {
                System.out.println(names[i]);
            }
        }

    }

    public static String [] getNames()
    {
        String [] names = new String[6];

        names[0] = "John";
        names[1] = "David";
        names[2] = "Isaiah";
        names[3] = "Kisang";
        names[4] = "Soninke";

        return names;
    }
}
