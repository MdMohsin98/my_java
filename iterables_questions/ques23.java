import java.util.Scanner;

public class ques23 {
    public static void main(String[] args) {
        // Write a program to print the sum of negative numbers, sum of 
        // positive even numbers and sum of positive odd numbers from a 
        // list of numbers (N) entered by the user. The list terminates 
        // when the user enters a zero.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of list: ");
        int num = sc.nextInt();

        int negative_sum = 0, odd_sum= 0, even_sum=0;
        for (int i = 1; i<=num;i++){
            System.out.print("Enter number "+i+" = ");
            int num1 = sc.nextInt();
            if (num1<0) {
                negative_sum = negative_sum+num1;
            }
            else if(num1%2==0 && num1>0){
                even_sum = even_sum + num1;
            }
            else if(num1%2==1 && num1>0){
                odd_sum = odd_sum+num1;
            }
            else if(num1==0){
                System.out.println("List Terminated");
                break;
            }

        }
        System.out.println("Sum of Negative Numbers: " + negative_sum);
        System.out.println("Sum of pos. even numbers: " + even_sum);
        System.out.println("Sum of pos. odd numbers: " + odd_sum);
    }
    
}
