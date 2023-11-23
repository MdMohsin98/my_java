package Exercise_1;

import java.util.Scanner;

public class ques3 {
    public static int max_num(int a, int b){
        int num1 = (a>b)? a:b;
        return num1;
    }
    public static void main(String[] args) {
        // Write a function which 
        // takes in 2 numbers and returns the greater of those two.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Maximum Number: " +max_num(a, b));
        sc.close();

    }
    
}
