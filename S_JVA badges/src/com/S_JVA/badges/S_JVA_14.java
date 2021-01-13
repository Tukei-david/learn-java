public class  S_JVA_14
{
    /**
     * These methods convert celcious degrees to fhrenherit degrees
     * @param celsiusDegrees Degress targeted to be converted
     */
    public static void celsiusToFhrenheit(double celsiusDegrees){
       //Your code here
        double fhrenheitValue;
        fhrenheitValue = (celsiusDegrees * 9/5) + 32;
        System.out.println(fhrenheitValue);
    }


    public static void main (String [] args) {
        //This is for testing your function when you run main(String [] args), but it should work for any value
        
        System.out.println("How many Fhrenheit are 34 Celsius degrees?");
        //This order should write "93.2"
        celsiusToFhrenheit(34);
        
        System.out.println("How many Fhrenheit are -4 Celsius degrees?");
        //This order should write "24.8"
        celsiusToFhrenheit(-4);
        
        System.out.println("How many Fhrenheit are 65 Celsius degrees?");
        //This order should write "149"
        celsiusToFhrenheit(65);
        
        System.out.println("How many Fhrenheit are 10 Celsius degrees?");
        //This order should write "50"
        celsiusToFhrenheit(10);
        
        System.out.println("How many Fhrenheit are -21 Celsius degrees?");
        //This order should write "-5.8"
        celsiusToFhrenheit(-21);
        
    }
}
