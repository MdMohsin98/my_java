package conditional_questions;

import java.util.Scanner;

public class ques19 {
    public static void main(String[] args) {
        // Write a program to accept a two-digit number. Add the sum of 
        // its digits to the product of its digits. If the value is equal 
        // to the number input, output the message “Special 2-digit number” 
        // otherwise, output the message “Not a special 2-digit number”
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 2 digit number: ");
        int num = sc.nextInt();
        if (num>9 && num < 100) {
            int digit1 = num/10;
            int digit2 = num%10;
            if ((digit1+digit2)+(digit1*digit2) == num) {
                System.out.println("Special 2-digit number");
            } 
            else {
                System.out.println("Not special number");
            }
        }
        else{
            System.out.println("Enter 2-digit number only.");
        }
        sc.close();
    }
    
}
