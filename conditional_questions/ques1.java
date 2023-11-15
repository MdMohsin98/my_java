package conditional_questions;
import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        // Write a program to input an integer and check whether 
        // it is greater than 100, or less than 100 or equal to 100.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        if (num>100) {
            System.out.println("Greater than 100");
        }
        else if(num<100){
            System.out.println("Less than 100");
        }
        else{
            System.out.println("Equal to 100");
        }
        sc.close();
    }

    
}