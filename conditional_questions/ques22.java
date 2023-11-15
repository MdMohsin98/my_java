package conditional_questions;

import java.util.Scanner;

public class ques22 {
    public static void main(String[] args) {
        // Write a menu driven program to input a day number between 
        // 1 to 7 and print the corresponding weekday. That is 
        // for 1 display Sunday, for 2 display Monday for 3 display Tuesday, etc.
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number from 1 to 7: ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter numbers from 1 to 7 only.");
                break;
        }
        sc.close();
    }
}
