package strings_ques;

import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        
    // WAP to accept a word and check whether it is palindrome or not
    // Sample Input : madam.
    // Sample Output : Palindrome word

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a new word: ");
    String s1 = sc.next();

    s1 = s1.toLowerCase();
    String original_string = s1;
    String palindrome_word = "";

    // First Method

    for (int i=0; i<s1.length(); i++){
        palindrome_word = s1.charAt(i)+palindrome_word;
    }

    if (original_string.compareTo(palindrome_word)==0) {
        System.out.println("Palindrome word");
    }
    else{
        System.out.println("Not a palindrome.");
    }

    // Second Method
    
    System.out.println("Second Method");

    String palindrome2 = "";
    for (int i=s1.length()-1; i>=0; i--){
        palindrome2 = palindrome2+s1.charAt(i);
    }
    if (palindrome2.compareTo(s1)==0) {
        System.out.println("Palindrome Word");        
    }
    else{
        System.out.println("Not a palindrome.");
    }
    sc.close();

    }
}
