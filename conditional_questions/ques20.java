package conditional_questions;

import java.util.Scanner;

public class ques20 {
    public static void main(String[] args) {
        // Write a program to input an integer and using ternary 
        //operator check whether it is an Even or an Odd number.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = (num%2==0)? "Even":"Odd";
        System.out.println(result);
        sc.close();
    }
}
