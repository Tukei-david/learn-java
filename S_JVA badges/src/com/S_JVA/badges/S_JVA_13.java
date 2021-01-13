public class S_JVA_13
{
    /**
     * These methods checks the price if it is in range to determin the disount deducted
     * @param price Price of the product entered
     */
    public static void isDicount(double price){
       //Your code here
        double newPrice;
        if (price > 1500 && price <= 3000)
        {
            double discountPrice = price * 0.03;
            newPrice = price - discountPrice;
            System.out.println("Yes, the discount is 3%, that means " + discountPrice + " discount " + "final quantity is " + newPrice);
        }
        else if (price > 3000 && price <= 8000)
        {
            double discountPrice = price * 0.06;
            newPrice = price - discountPrice;
            System.out.println("Yes, the discount is 6%, that means " + discountPrice + " discount " + "final quantity is " + newPrice);
        }
        else if (price > 8000 && price <= 13000)
        {
            double discountPrice = price * 0.09;
            newPrice = price - discountPrice;
            System.out.println("Yes, the discount is 9%, that means " + discountPrice + " discount " + "final quantity is " + newPrice);
        }
        else  if (price > 13000)
        {
            double discountPrice = price * 0.13;
            newPrice = price - discountPrice;
            System.out.println("Yes, the discount is 13%, that means " + discountPrice + " discount " + "final quantity is " + newPrice);
        }
        else
        {
            System.out.println("No sorry");
        }
    }

    public static void main (String [] args) {
        //This is for testing your function when you run main(String [] args), but it should work for any value
        
        System.out.println("Is the quantity of 157 applicable for a discount?");
        //This order should write "No, sorry"
        isDicount(157);
        
        System.out.println("Is the quantity of 1537 applicable for a discount?");
        //This order should write "Yes, the discount is 3%, that means 46,11 discount, final quantity is 1490,89"
        isDicount(1537);
        
        System.out.println("Is the quantity of 3589 applicable for a discount?");
        //This order should write "Yes, the discount is 6%, that means 215,34 discount, final quantity is 3373,66"
        isDicount(3589);
        
        System.out.println("Is the quantity of 13000 applicable for a discount?");
        //This order should write "Yes, the discount is 9%, that means 1170 discount, final quantity is 11830"
        isDicount(13000);
        
        System.out.println("Is the quantity of 13001 applicable for a discount?");
        //This order should write "Yes, the discount is 13%, that means 1690,13 discount, final quantity is 11310,87"
        isDicount(13001);
        
    }
}
