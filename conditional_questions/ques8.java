package conditional_questions;

import java.util.Scanner;

public class ques8 {
    public static void main(String[] args) {
        // Write a program to check whether an int type number (taken as input) 
        // is a 2-digit number or not. (hint: 10 to 99)

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num>9 && num <100){
            System.out.println("Two digit number");
        }
        else{
            System.out.println("Not a two digit number");
        }
        sc.close();
    }
    
}
