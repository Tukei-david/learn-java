import java.text.DecimalFormat;

public class S_JVA_16
{
    /**
     *These methods converts miles to KM
     * @param miles Store the conversion value from km to miles
     * convKm variable store the value converted in miles
     */
    public static void milesToKM(double miles){
       //Your code here
        double convKm;
        // didn't understand te equation, decided to put it this way
        convKm = miles * 1.609;
        // Converting the decimal to two round places only
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        System.out.println(numberFormat.format(convKm));
    }

    public static void main (String [] args) {
        //This is for testing your function when you run main(String [] args), but it should work for any value
        
        System.out.println("How many KM are 93.2 Miles?");
        //This order should write "149,99 KM"
        milesToKM(93.2);
        
        System.out.println("How many KM are 24.8 Miles?");
        //This order should write "39,91"
        milesToKM(24.8);
        
        System.out.println("How many KM are 149 Miles?");
        //This order should write "239,79"
        milesToKM(149);
        
        System.out.println("How many KM are 50 Miles?");
        //This order should write "80,47"
        milesToKM(50);
        
        System.out.println("How many KM are 5.8 Miles?");
        //This order should write "9.33"
        milesToKM(5.8);
        
    }
}
