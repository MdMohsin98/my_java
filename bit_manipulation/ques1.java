package bit_manipulation;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        // Write a program to find if a number is a power of 2 or not

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        while (num>=2) {
            if (num%2==0) {
                num = num/2;
                if (num==2) {
                    System.out.println("The number is power of 2");                    
                }
            }
            else{
                System.out.println("Number is not a power of 2.");
                break;
            }
        }
        sc.close();
    }
    
}
