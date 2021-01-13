import javax.swing.*;

//Here starts the class
public class S_JVA_3
{
    /* This function should write hello + the name given */
    public static void sayHello(String name){
        //Your code here
        System.out.println("Hello " + name);
    }
    
    //Here is the main method, the first method
    //tyhat will run when you start the program
    public static void main (String [] args) {
        //This is for testing your function when you run main(String [] args), but it should work for any value
        
        //This order should write "Hello Joan!"
        sayHello("Joan");
        
         //This order should write "Hello Lurdes!"
        sayHello("Lurdes");
        
    }
}
