import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        // Write a program to input an integer and find its factorial. 
        // Factorial of a number is the product of all natural numbers 
        // till that number. For example factorial of 5 is 120 
        // since 1×2×3×4×5=120.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num1 = sc.nextInt();

        int i, fact=1;
        for(i=1;i<=num1;i++){
            // System.out.println(i);
            if(num1==0){
                fact = 1;
            }
            else{
                fact = fact*i;
            }
        }
        System.out.println(fact);
    }
    
}
