package conditional_questions;

import java.util.Scanner;

public class ques18 {
    public static void main(String[] args) {
        // Write a program to input an integer and check whether 
        // it is a 3-digit number or not. If it is check whether the sum 
        // of first and last digit is Even or an Odd number.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3 digit number: ");
        int num = sc.nextInt();
        if (num>99 && num <1000) {
            int digit1 = num/100;
            int digit2 = num%10;
            int sum = digit1+digit2;
            if (sum%2==0) {
                System.out.println("Sum of "+digit1+" + " + digit2+ " = " +sum+" is Even");
            }
            else{
                System.out.println("Sum of "+digit1+" + " + digit2+ " = " +sum+" is Odd");
            }  
        }
        else{
            System.out.println("Enter a 3 digit number");
        }
        sc.close();
    }
    
}
