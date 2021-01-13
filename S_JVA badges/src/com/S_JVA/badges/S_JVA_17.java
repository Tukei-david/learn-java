import java.text.DecimalFormat;

public class S_JVA_17
{
    /**
     * These methods converts KM to miles
     * @param KM KM targted
     */
    public static void KmToMiles(double KM){
       //Your code here
        double convMiles;
        // didn't understand te equation, decided to put it this way
        convMiles = KM / 1.609;
        // COnverting double to one decimal place only
        DecimalFormat numberFormat = new DecimalFormat("#.0");
        System.out.println(numberFormat.format(convMiles));
    }

    public static void main (String [] args) {
        //This is for testing your function when you run main(String [] args), but it should work for any value
        
        System.out.println("How many Miles are 149.99 KM?");
        //This order should write "93.2 KM"
        KmToMiles(149.99);
        
        System.out.println("How many Miles are 39.91 KM?");
        //This order should write "24.8"
        KmToMiles(39.91);
        
        System.out.println("How many Miles are 239.79 KM?");
        //This order should write "149"
        KmToMiles(239.79);
        
        System.out.println("How many Miles are 80.47 KM?");
        //This order should write "50"
        KmToMiles(80.47);
        
        System.out.println("How many Miles are 9.33 KM?");
        //This order should write "5.8"
        KmToMiles(9.33);
        
    }
}
