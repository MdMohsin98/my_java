import java.util.Scanner;

public class functions_and_methods {
    // Functions and methods in Java
    
    public static void print_java(){
        System.out.println("Hello, Welcome to Java.");
    }
    public static void intro(String name2) {
        System.out.println("Name: " + name2);
        System.out.println("BCA");
        System.out.println("T.M.B.U.");
    }

    // Another Example - With Arguements

    public static void greeting(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name1 = sc.nextLine();
        System.out.println("Hello, "+ name1);
        System.out.println("Welcome to Java.");

    }
    public static void addition(){
        System.out.print("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = a+b;
        System.out.println("Addition: " + c);

    }
    public static void main(String[] args) {
        // Functions and Methods
        print_java();
        intro("Mohsin");   
        greeting();   
        addition();
    }
}
