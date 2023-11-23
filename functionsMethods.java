import java.util.Scanner;

class print_my_name{
    public String print_name(String name1){
        // System.out.println("Your name is : "+name1);
        return name1;
    }
}
class mathematical_oprations{
    double n1, n2;
    Scanner sc = new Scanner(System.in);
    public double sum_numbers(){
        System.out.print("Enter two number: ");
        this.n1 = sc.nextDouble();
        this.n2 = sc.nextDouble();
        return n1+n2;
    }
    public double multiply_numbers(){
        System.out.println("Enter two numbers: ");
        this.n1 = sc.nextDouble();
        this.n2 = sc.nextDouble();
        return n1*n2;
    }
    public void factorial(){
        System.out.println("Enter a number: ");
        int n1 = sc.nextInt();
        if (n1<0) {
            System.out.println("Invalid");   
            return;        
        }
        double fact = 1;
        for(int i = 1; i<=n1;i++){
            fact = fact*i;
        }
        System.out.println("Factorial : "+fact);
    }
}
public class functionsMethods {
    public static void greetings(){
        System.out.println("Hello, Welcome to Java");
    }
    public static void intro(String name){
        System.out.println("Welcome, "+name);
    }
    public static void main(String[] args) {
        // Functions and Methods in Java
        greetings();
        
        print_my_name pt = new print_my_name();
        // pt.print_name("Mohammad Mohsin");
        System.out.println(pt.print_name("Mohammad Mohsin"));
        intro(pt.print_name("Mohammad Mohsin"));

        mathematical_oprations mo = new mathematical_oprations();
        // s.sum_numbers();
        System.out.println("Sum of the numbers are: "+mo.sum_numbers());
        // Multiply numbers
        System.out.println("Multiplications: "+mo.multiply_numbers());
        // Factorial
        mo.factorial();
    }
    
    
}


// Difference between functions and methods

// Functions can be called directly
// Methods are called by the help of making an object of class.

// For example: mo.factorial() is called object

// While: greetings() is called function.
