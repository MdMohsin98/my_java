package conditional_questions;

import java.util.Scanner;

public class ques17 {
    public static void main(String[] args) {
        // Write a program to input an integer and check whether it is a 
        // 4-digit number or not. If it is find the sum of first and last digit.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4 digit number: ");
        int num = sc.nextInt();
        if (num>999 && num<10000) {
            int digit1 = num/1000;
            int digit2 = num%10;
            System.out.println("The sum of "+digit1+" + "+digit2+" = "+((int)digit1+(int)digit2));            
        }
        else{
            System.out.println("Enter a 4 digit number.");
        }
        sc.close();
    }
    
}
