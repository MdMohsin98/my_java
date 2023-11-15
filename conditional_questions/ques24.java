package conditional_questions;

import java.util.Scanner;

public class ques24 {
    public static void main(String[] args) {
        // Write a program to input three integers and check 
        // whether it forms a Pythagorean triplet or not. A set of three 
        // integers is said to be a Pythagoren triplet if the sum of the
        // squares of any two integers is equal to square of the 
        // third integer. Example, (3, 4, 5), (5, 12, 13), and (7, 24, 25).

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        if((num1*num1)==(num2*num2+num3*num3) || (num2*num2)==(num1*num1+num3*num3) || (num3*num3)==(num2*num2+num1*num1)){
            System.out.println("Pythagorean Triplet");
        }
        else{
            System.out.println("Not a Pythagorean Triplet");
        }
        sc.close();
    }
    
}
