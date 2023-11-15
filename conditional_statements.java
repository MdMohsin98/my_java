import java.util.Scanner;

public class conditional_statements {
    public static void main(String[] args) {
        // Conditional Statements
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        double marks1 = sc.nextDouble();
        if(marks1>=60)
        System.out.println("Pass");
        else
        System.out.println("Fail");
        
        // Another example
        
        System.out.print("Enter Your age: ");
        int age = sc.nextInt();
        if  (age>=18)
        System.out.println("Can vote.");
        else
        System.out.println("Can't vote.");
        sc.close();
    }
    
}
