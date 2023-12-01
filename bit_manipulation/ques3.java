package bit_manipulation;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        // Write a program to count the number of 1’s in a binary 
        // representation of the number.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String binary_num = Integer.toBinaryString(num);

        int ones_count = 0;
        for (int i=0; i<binary_num.length(); i++){
            if (binary_num.charAt(i)=='1') {
                ones_count = ones_count+1;
            }
        }
        
        System.out.println("Total Ones: "+ones_count);
        sc.close();
    }
    
}
