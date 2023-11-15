package conditional_questions;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        // Write a program to input the Selling Price and Cost Price of a 
        // commodity and find the Profit or Loss made upon selling the product.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Selling Price of the commodity: ");
        double sp = sc.nextDouble();
        System.out.print("Enter the Cost Price of the commodity: ");
        double cp = sc.nextDouble();

        if (sp>cp) {
            System.out.println("Profit: " + ((double)sp-(double)cp));
        }
        else if (cp>sp) {
            System.out.println("Loss: " + ((double)cp-(double)sp));
        }
        else{
            System.out.println("No benefit or loss");
        }
        sc.close();
    }
    
}
