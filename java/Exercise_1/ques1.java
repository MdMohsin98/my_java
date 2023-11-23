package Exercise_1;

import java.util.Scanner;

public class ques1 {
    public static int average(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        // Enter 3 numbers from the user & make a function 
        // to print their average.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("Average: "+average(num1, num2, num3));
        sc.close();
    }
    
}
