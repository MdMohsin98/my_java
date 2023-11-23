package Exercise_1;

import java.util.Scanner;

public class ques9 {
    public static int gcd(int a, int b){
        int c = (a>b)?a:b;
        int hcf=0;
        for (int i =c;i>=1;i--){
            if (a%i==0 && b%i==0) {
                hcf = i;
                break;             
            }
        }
        return hcf;
    }
    public static void main(String[] args) {
        // Write a function that calculates the Greatest Common Divisor 
        // of 2 numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Greatest Common Devisor: "+gcd(a, b));
        sc.close();
    }
    
}
