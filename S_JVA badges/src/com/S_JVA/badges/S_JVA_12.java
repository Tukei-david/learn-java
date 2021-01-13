public class S_JVA_12
{
    /**
     * These methods checks the number angle can made up to a triangle shape
     * @param numberA Angle one
     * @param numberB Angle two
     * @param numberC Angle Three
     * @return Returns a string if it is true or false
     */
    public static boolean isTriangle(int numberA, int numberB, int numberC){
       //Your code here
        boolean istriangle = true;
        if ((numberA + numberB + numberC) == 180)
        {

            return istriangle;
        }
        else
        {
            istriangle = false;
        }
    return istriangle;
    }

    public static void main (String [] args) {
        //This is for testing your function when you run main(String [] args), but it should work for any value
        
        System.out.println("Can a triangle have angles with 17, 290 and 103 degrees?");
        //This order should write "The number is False"
        System.out.println(isTriangle(17, 290, 103));
        
        System.out.println("Can a triangle have angles with 57, 20 and 103 degrees?");
        //This order should write "The number is True"
        System.out.println(isTriangle(57, 20, 103));
        
        System.out.println("Can a triangle have angles with 68, 21 and 86 degrees?");
        //This order should write "The number is False"
        System.out.println(isTriangle(68, 21, 86));
        
        System.out.println("Can a triangle have angles with 56, 48 and 76 degrees?");
        //This order should write "The number is True"
        System.out.println(isTriangle(56, 48, 76));
        
        System.out.println("Can a triangle have angles with 78, 32 and 70 degrees?");
        //This order should write "The number is False"
        System.out.println(isTriangle(78, 32, 70));
        
    }
}
