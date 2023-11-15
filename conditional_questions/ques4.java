package conditional_questions;

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        // Write a program to check whether a short type number taken as 
        // input is an even number or an odd number.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        short num = sc.nextShort();
        if (num%2==0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        sc.close();
    }
    
}
