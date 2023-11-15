package conditional_questions;

import java.util.Scanner;

public class ques13 {
    public static void main(String[] args) {
        // Write a program to accept a mark obtained by a student in 
        // computer science and print the grades accordingly:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();
        if (marks>=90) {
            System.out.println("Grade: A");
        }
        else if (marks>=70 && marks <=89) {
            System.out.println("Grade B");
        }
        else if (marks >= 50 && marks <= 69) {
            System.out.println("Grade C");
        }
        else if (marks<50) {
            System.out.println("Grade D");
        }
        else{
            System.out.println("Enter the marks between 1-100");
        }
        sc.close();
    }
    
}
