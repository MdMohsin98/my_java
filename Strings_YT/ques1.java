package Strings_YT;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        // Take an array of Strings input from the user & find the 
        // cumulative (combined) length of all those strings.

        Scanner sc =new Scanner(System.in);

        String[] names = new String[5];

        System.out.println("Enter the names.");
        int len = 0;
        for (int i = 0; i<5; i++){
            names[i] = sc.nextLine();

            len = len+names[i].length();
        }
        
        System.out.println("Cumulative sum: "+len);

        sc.close();
    }
    
}
