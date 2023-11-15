package conditional_questions;

import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        // Write a program to input 5 real numbers (floating point) and 
        // find their average. If the average is greater than 50 print good, 
        // otherwise print bad.

        Scanner sc =  new Scanner(System.in);
        int sum= 0;
        for (int i=1;i<=5;i++){
            System.out.print("Enter number " +i+" = ");
            int num = sc.nextInt();
            sum = sum+num;
        }
        int avg = sum/5;
        if (avg>50) {
            System.out.println("Good");
        }
        else{
            System.out.println("Bad");
        }
        sc.close();
    }
    
}
