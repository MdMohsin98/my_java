package conditional_questions;

import java.util.Scanner;

public class ques16 {
    public static void main(String[] args) {
        // Write a program to input an integer and check whether it is a 
        // 5-digit number or not. If it is extract the central digit and print it.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 5 digit number: ");
        int num = sc.nextInt();
        if (num>9999 && num <= 99999) {
            int digit = num%1000;
            digit = digit/100;
            System.out.println(digit);
        }
        else{
            System.out.println("Not a 5 digit number.");
        }
        sc.close();
    }
    
}
