package conditional_questions;

import java.util.Scanner;

public class ques10 {
    public static void main(String[] args) {
        // Write a program to input three integers and check whether all of 
        // them are unique (different) from each other or not.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1!=num2 && num2!=num3 && num3!=num1) {
            System.out.println("Each numbers are different.");
        }
        else{
            System.out.println("Each numbers are not different.");
        }
        sc.close();
    }
    
}
