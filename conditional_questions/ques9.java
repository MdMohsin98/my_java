package conditional_questions;

import java.util.Scanner;

public class ques9 {
    public static void main(String[] args) {
        // Write a program to check whether an int type number (taken as input) is 
        // a 3-digit number divisible by three or not.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num>99 && num <1000 && num%3==0){
            System.out.println("Three digit number divisible by 3");
        }
        else if(num>99 && num <1000 && num%3!=0){
            System.out.println("Three digit number not divisible by 3");
        }
        else{
            System.out.println("Not a three digit number");
        }
        sc.close();
    }
    
}
