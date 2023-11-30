package strings_ques;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        // WAPtoacceptawordanddisplayitinfollowingmanner.
        // SampleInput:Science
        // SampleOutput
        // S
        // c
        // i
        // e
        // n
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a new word: ");
        String s1 = sc.nextLine();

        for (int i = 0; i<s1.length(); i++){
            System.out.println(s1.charAt(i));
        }
        sc.close();
    }
    
}
