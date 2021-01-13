public class compareArrays {
    public static void main(String[] args) {
        int [] numbers1 = {10, 20, 30, 40};
        int [] numbers2 = {10, 20, 30, 40};

        boolean status = true;
        int i = 0;

        if (numbers1.length != numbers2.length)
        {
            status = false;
        }
        while (status && i < numbers1.length)
        {
            if (numbers1[i] != numbers2[i])
            {
                status = false;
            }
            i++;
        }

        if (status)
        {
            System.out.println("They are the same");
        }
        else
        {
            System.out.println("They are not the same");
        }
    }

}
