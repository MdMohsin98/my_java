package conditional_questions;

import java.util.Scanner;

public class ques15 {
    public static void main(String[] args) {
        // An electricity company charges their consumers according to the 
        // units consumed per month according to the given traffic:

        // In addition to the above, every consumer has to pay ₹ 200 as 
        // Service Charge per month. Write a program to input the amount of units 
        // consumed and calculate the total charges payable (Bill) by the consumer.

        Scanner sc = new Scanner(System.in);
        System.out.print("Total Units Consumed: ");
        double units = sc.nextInt();
        double cost = 0;
        if (units<=100) {
            cost = 200+units*2;
            System.out.println("Payable Bill: "+cost);
        }
        else if (units>100 && units<=200) {
            cost = 200+units*1.80;
            System.out.println("Payable Bill: "+cost);
        }
        else if (units>200) {
            cost = 200+units*1.50;
            System.out.println("Payable Bill: "+cost);
        }
        sc.close();
    }  
}
