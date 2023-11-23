package Exercise_1;

import java.util.Scanner;

public class ques6 {
    public static void infinite_loop(int a){
        do {
                System.out.println("Infinite Loop."+a);
                a++;            
        } while (a>1);
    }
    public static void main(String[] args) {
        // Write an infinite loop using do while condition.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number greater than 1: ");
        int b = sc.nextInt();
        infinite_loop(b);
        sc.close();
    }
    
}
