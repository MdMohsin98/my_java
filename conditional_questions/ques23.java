package conditional_questions;

import java.util.Scanner;

public class ques23 {
    public static void main(String[] args) {
        // Write a program to input an integer and check whether it is 
        // divisible by 3 or not using swich case only (no if-else statement)

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int remainder = num%3;

        switch (remainder) {
            case 0:
                System.out.println("Divisible by 3");                
                break;
            default:
                System.out.println("Not divisible by 3");
                break;
        }
        sc.close();
    }
}
