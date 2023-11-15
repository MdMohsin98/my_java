package conditional_questions;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        
        // Write a program to check whether a int type number taken as 
        // input is a positive, negative or a zero.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num>0) {
            System.out.println("Positive");
        }
        else if (num<0) {
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
        sc.close();;
    }
    
}
