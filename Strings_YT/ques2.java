package Strings_YT;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        // Input a string from the user. Create a new string called 
        // ‘result’ in which you will replace the letter ‘e’ in the original 
        // string with letter ‘i’. 
        // Example : 
        // original = “eabcdef’ ; result = “iabcdif”
        // Original = “xyz” ; result = “xyz”

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a new String: ");
        String original = sc.nextLine();

        String result = original.replace("e", "i");
        System.out.println("New String: "+result);
        sc.close();

    }
    
}
