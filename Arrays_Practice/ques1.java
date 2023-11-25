package Arrays_Practice;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        // Take an array of names as input from the user and 
        // print them on the screen.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        String names[] = new String[size];

        System.out.println("Enter the names: ");
        for (int i = 0; i<size; i++){
            names[i] = sc.next();
        }
        System.out.println("You Entered the following names.");
        for (int i = 0; i<size; i++){
            System.out.println(names[i]);
        }
        sc.close();
    }
    
}
