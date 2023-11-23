package Exercise_1;

import java.util.Scanner;

public class ques7 {
    public static void enter_numbers(){
        Scanner sc = new Scanner(System.in);
        int a, positive=0, negative=0, zeros=0;
        do {
            System.out.print("Enter a number (to close type: -101): ");
            a = sc.nextInt();
            if (a>0) {
                positive = positive+1;
            }
            else if (a<0 && a!= -101) {
                negative = negative+1;
            }
            else if(Math.abs(a)==0){
                zeros = zeros+1;
            }
        } while (a != -101);
        sc.close();
        System.out.println("Total Positives: " +positive);
        System.out.println("Total Negatives: " +negative);
        System.out.println("Total Zeros: "+zeros);

    }
    public static void main(String[] args) {
        // Write a program to enter the numbers till the user wants 
        // and at the end it should display the count of positive, 
        // negative and zeros entered.

        enter_numbers();

    }
    
}
