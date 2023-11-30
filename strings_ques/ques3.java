package strings_ques;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        // WAP to accept a string and change the case of each character and 
        // print the new string.(Togglecase)

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a new word: ");
        String s1 = sc.nextLine();

        String new_word = "";
        
        for (int i =0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            if (Character.isLowerCase(ch)) {
                new_word = new_word+Character.toUpperCase(ch);
            }
            else{
                new_word = new_word+Character.toLowerCase(ch);
            }
        }

        System.out.println("Old Word: " + s1 + "\nNew Word: "+new_word);
        sc.close();

    }
    
}
