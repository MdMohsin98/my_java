import java.util.Scanner;

public class logical_operators {
    public static void main(String[] args) {
        // Logical Operators

        //          &&      ||      

        // && operator
        // In && operator both the codition applied should be true.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        double a = sc.nextDouble();
        if (a%2==0 && a%5==0)
        System.out.println("Number is divisible by 10");
        
        // || operator (pipe operator) - Logical OR

        if (a%2==0 || a%5==0)
        System.out.println("The number is divisible by 2 or 5");

        // != operator = Not Equal to

        if (a%2!=0){
        System.out.println("The number is odd.");
        // For writing more than two lines in if block we must put it
        // inside the curly braces.
        System.out.println("The number is not divisible by 2");
        }
        else
        System.out.println("The number is even");

        // More on if, else if and else statements

        System.out.print("Enter the amount: ");
        double money = sc.nextDouble();

        if (money < 10){
            System.out.println("You can't get anything");
            System.out.println("Bring more money");
        }
        else if (money > 10 && money < 50)
        System.out.println("You can get only one thing");

        else
        System.out.println("You can get multiple things.");


    }
}
