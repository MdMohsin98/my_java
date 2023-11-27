package Strings_YT;

import java.util.Scanner;

public class sb_reverse_string {
    public static void main(String[] args) {
        // Reverse a string

        // Method 1 : Using Simple String input

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String name1 = sc.next();
        String reverse_string = "";
        
        for (int i = name1.length()-1; i>=0; i--){
            reverse_string = reverse_string+name1.charAt(i);
        }
        System.out.println(reverse_string);
    

        // Method 2: Using StringBuilder

        System.out.print("Enter a new word: ");
        StringBuilder sb = new StringBuilder(sc.next());

        String reverse_string2 = "";
        for (int i = sb.length()-1; i>=0;i-- ){
            reverse_string2 = reverse_string2+sb.charAt(i);
        }
        System.out.println("Reverse String is : "+reverse_string2);
        

        // Method 3: Using Array method

        System.out.print("Enter a new word: ");
        String name2 = sc.next();
        String[] name_2_arr = new String[name2.length()];
        name_2_arr = name2.split("");

        String reverse_string4 = "";
        for (int i=name2.length()-1; i>=0; i--){
            reverse_string4 = reverse_string4+name_2_arr[i];
        }
        System.out.println("New reverse string: " + reverse_string4);

        sc.close();
    }
    
}
