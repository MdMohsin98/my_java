package strings_ques;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        // WAPtoacceptastringandcountnumberofvowelinit.
        // SampleInput:Yobro
        // SampleOutput:
        // Numberofvowels=2

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a new word: ");
        String sb = sc.nextLine();

        String s1 = sb.toLowerCase();

        int vowels = 0;
    
        for (int i = 0; i < sb.length(); i++){
            if (s1.charAt(i)=='a'||s1.charAt(i)=='e'|| s1.charAt(i)=='i'|| s1.charAt(i)=='o'||s1.charAt(i)=='u') {
                vowels = vowels+1;                
            }
        }

        System.out.printf("The word { %s } has %d vowels.",sb,vowels);
        sc.close();
    }
    
}
