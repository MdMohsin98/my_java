package strings_ques;

import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        // WAP to accept a name and display the initials
        // along with the surname.
        // Sample Input:Asif Ali Ahmad
        // Sample Output: A. A. Ahmad

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String s1 = sc.nextLine();

        String s2[] = s1.split(" ");

        for (int i = 0; i<s2.length-1; i++){
            s2[i] = s2[i].charAt(0)+". ";
        }

        String s3 = String.join("", s2);
        // for (int i =0 ;i<s2.length; i++){
        //     s3 = s3+s2[i];
        // }

        System.out.println("New Name: "+ s3);
        sc.close();
    }
    
}
