package conditional_questions;

import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        // Write a program to check whether an int type number (taken as input) 
        // is a multiple of 5 or 3 or both or neither of them.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num%3==0 && num%5==0) {
            System.out.println("Multiple of 3 and 5");
        }
        else if (num%3==0) {
            System.out.println("Multiple of 3");
        }
        else if (num%5==0) {
            System.out.println("Multiple of 5");
        }
        else{
            System.out.println("Not a multiple of 5 or 3");
        }
        sc.close();
    }
    
}
