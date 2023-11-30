package strings_ques;

import java.util.Arrays;
import java.util.Scanner;

public class ques8 {
    public static void main(String[] args) {
        // WAP to accept 10 name in array and display it in ascending
        // order of the letter.
        Scanner sc = new Scanner(System.in);

        String[] names = new String[10];

        System.out.println("Enter 10 Names below.");
        for (int i = 0; i<10; i++){
            names[i] = sc.nextLine();
        }
        Arrays.sort(names);
        System.out.println("Sorted Names : ");
        for (int i = 0; i<10; i++){
            System.out.println(names[i]);
        }
        sc.close();
    }
    
}
