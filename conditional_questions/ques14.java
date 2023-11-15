package conditional_questions;

import java.util.Scanner;

public class ques14 {
    public static void main(String[] args) {
        // A cloth showroom has announced the following festival discounts 
        // on the purchase of items, based on the total cost of the items 
        // purchased:

        // Write a program to input the total cost and compute and display 
        // the amount to be paid by the customer after availing the discount.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total cost: ");
        double cost = sc.nextDouble();

        double discount = 0;
        if (cost <= 2000) {
            // 5% discount below 2000
            discount = cost*0.05; 
            System.out.println("Discount Price " +((double)cost-(double)discount));
        }
        else if (cost>=2001 && cost <= 5000) {
            discount = cost*0.25;
            System.out.println("Discount Price " +((double)cost-(double)discount));            
        }
        else if (cost>=5001 && cost<=10000) {
            discount = cost*0.35;
            System.out.println("Discount Price " +((double)cost-(double)discount));            
        }
        else if (cost>10000) {
            discount = cost*0.50;
            System.out.println("Discount Price " +((double)cost-(double)discount));
        }
        sc.close();

    }
    
}
