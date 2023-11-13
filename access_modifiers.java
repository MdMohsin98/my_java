// Access Modifiers

import java.util.Scanner;

class bank1{
    public String ac_name;      // public accessifier
    long account_number;        // default accessifier - we don't need to use any special character to define it
    protected String password;  // In it's own class anywhere is accessible but in another class it's own object can access it.
    private int pin;            // Not accessible outside the class 

    // To access the private accessifiers we create
    // getter and setters

    Scanner sc = new Scanner(System.in);
    public int getPin(){
        return this.pin;
    }
    public int setPin(){
        System.out.print("Enter new pin: ");
        int n_pin = sc.nextInt();
        this.pin = n_pin;
        return this.pin;
    }
}

public class access_modifiers {
    public static void main(String[] args) {
        // Access modifiers
        // There are four types of access modifiers in Java
        // Access modifiers defines which properties should be 
        // accessible by which classes or objects.

        // Types of access modifiers
        //          public           ==>     Accessible anywhere within class       
        //          private          ==>
        //          protected        ==>      
        //          default

        bank1 b1 = new bank1();
        b1.ac_name = "Mohammad Mohsin";  // ac_name is public accessifier
        b1.account_number = 12345679333l;
        b1.password = "abc@123";
        System.out.println("Old pin: " + b1.getPin());
        b1.getPin();
        b1.setPin();
        System.out.print("New pin saved: " + b1.getPin());
        
    }
}
