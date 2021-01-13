public class S_JVA_15
{
    /**
     * Created variable to display the conversion and displayed it on the method
     * @param fhrenheitDegrees Degrees targetd
    */
    public static void fhrenheitToCelsius(double fhrenheitDegrees){
       //Your code here
        double celciousValue;
        celciousValue = (fhrenheitDegrees - 32) * 5/9;
        System.out.println(celciousValue);
    }

    public static void main (String [] args) {
        //This is for testing your function when you run main(String [] args), but it should work for any value
        
        System.out.println("How many Celsius are 93.2 Fhrenheit degrees?");
        //This order should write "34"
        fhrenheitToCelsius(93.2);
        
        System.out.println("How many Celsius are -24.8 Fhrenheit degrees?");
        //This order should write "-4"
        fhrenheitToCelsius(-24.8);
        
        System.out.println("How many Celsius are 149 Fhrenheit degrees?");
        //This order should write "65"
        fhrenheitToCelsius(149);
        
        System.out.println("How many Celsius are 50 Fhrenheit degrees?");
        //This order should write "10"
        fhrenheitToCelsius(50);
        
        System.out.println("How many Celsius are -5.8 Fhrenheit degrees?");
        //This order should write "-21"
        fhrenheitToCelsius(-5.8);
        
    }
}
