package conditional_questions;

import java.util.Scanner;

public class ques21 {
    public static void main(String[] args) {
        // Using a switch statement, write a menu driven program 
        // to find the area and perimeter of a square or rectangle. 
        // For finding the area and perimeter of a square input the side
        // length and for finding the area and perimeter of the rectangle 
        // input the length and breadth.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for Rectangle and 2 for Square: ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Enter the length and breadth: ");
                double l = sc.nextDouble();
                double b = sc.nextDouble();
                System.out.println("Area: "+((double)l*(double)b));
                System.out.println("Perimeter: "+(2*((double)l+(double)b)));
                break;
            case 2:
                System.out.print("Enter the side of Square: ");
                double s = sc.nextDouble();
                System.out.println("Area: " + ((double)s*(double)s));
                System.out.println("Perimeter: " + (double)s*4);
                break;
            default:
                System.out.println("Enter 1 or 2 only.");
                break;
        }
        sc.close();
    }
    
}
