import java.util.Scanner;

public class ques17 {
    public static void main(String[] args) {
        // Write a program to calculate and print the sum of odd numbers 
        // and the sum of even numbers for the first n natural numbers. 
        // The integer n is to be entered by the user.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int i, sum_odd=0, sum_even=0;
        for(i=1; i<=num; i++){
            if(i%2==0){
                sum_even = sum_even+i;
            }
            if (i%2==1) {
                sum_odd = sum_odd+i;
            }
        }
        System.out.println("Sum of Even numbers from 1 to " +num+" : " + sum_even);
        System.out.println("Sum of Odd numbers from 1 to " +num+" : "+sum_odd);
    }
    
}
