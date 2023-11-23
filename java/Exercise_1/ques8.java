package Exercise_1;

import java.util.Scanner;

public class ques8 {
    public static double power_function(int a, int b){
        return Math.pow(a, b);
    }
    public static void main(String[] args) {
        // Two numbers are entered by the user, x and n. Write a function 
        // to find the value of one number raised to the power of 
        // another i.e. xn.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int num2 = sc.nextInt();
        System.out.println((int)power_function(num1, num2));
        sc.close();
    }
    
}
