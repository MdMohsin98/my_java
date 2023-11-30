package strings_ques;

import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        // WAP to accept a sentence in lowercase and convert first letter
        // of each alphabets in uppercase.
        // Sample Input : we all are unique.
        // Sample Output : We All Are Unique.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a new sentence: ");
        String s1 = sc.nextLine();

        String s2[] = s1.split(" ");

        for (int i = 0; i<s2.length; i++){
            char first_char = s2[i].charAt(0);
            s2[i] = s2[i].replace(first_char, Character.toUpperCase(first_char));
        }

        String s3 = "";

        for (int i =0; i<s2.length; i++){
            s3 = s3 + s2[i]+" ";
        }

        System.out.println("New Sentence: "+s3);

        sc.close();

    }
    
}
