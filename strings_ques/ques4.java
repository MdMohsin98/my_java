package strings_ques;

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        // WAP to accept a string and display the following.
        // 1.Number of lowercase character.
        // 2.Number of uppercase character.
        // 3.Number of special character.(includespace)
        // 4.Number of digit character.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a new word: ");
        String s1 = sc.nextLine();

        int lcase=0, ucase=0, schar= 0, digit=0;
        for (int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            if (Character.isUpperCase(ch)) {
                ucase = ucase +1;
            }
            else if (Character.isLowerCase(ch)) {
                lcase = lcase+1;
            }
            else if (Character.isDigit(ch)) {
                digit = digit+1;
            }
            else if (Character.isLetter(ch)==false || Character.isWhitespace(ch)==true) {
                schar = schar+1;
            }
        }
        System.out.println("Uppercase letters: "+ucase);
        System.out.println("Lowercase letters: "+lcase);
        System.out.println("Special Characters: "+schar);
        System.out.println("Digits: "+digit);
        sc.close();
    }
    
}
