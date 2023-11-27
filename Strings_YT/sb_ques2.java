package Strings_YT;

import java.util.Scanner;

public class sb_ques2 {
    public static void main(String[] args) {
        // Input a string from the user. Create a new string called 
        // ‘result’ in which you will replace the letter ‘e’ in the original 
        // string with letter ‘i’. 
        // Example : 
        // original = “eabcdef’ ; result = “iabcdif”
        // Original = “xyz” ; result = “xyz”

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any word: ");
        StringBuilder sb = new StringBuilder(sc.next());
        
        for (int i = 0; i<sb.length(); i++){
            if (sb.charAt(i)=='e') {
                sb.replace(i, i+1, "i");                               
            }
        }

        System.out.println("Modified word: " + sb);
        sc.close();
    }
    
}
