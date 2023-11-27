package Strings_YT;

import java.util.Scanner;

public class sb_ques1 {
    public static void main(String[] args) {
        // Take an array of Strings input from the user & find the 
        // cumulative (combined) length of all those strings.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of words: ");
        int size = sc.nextInt();

        StringBuilder[] sb = new StringBuilder[size];

        System.out.println("Enter the names");
        int char_length = 0;
        for (int i=0; i<size; i++){
            sb[i] = new StringBuilder(sc.next());
            char_length = char_length + sb[i].length();
        }
        System.out.println("Cumulative Length: " + char_length);
        sc.close();
    }
    
}
