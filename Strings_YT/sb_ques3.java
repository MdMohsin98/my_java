package Strings_YT;

import java.util.Scanner;

public class sb_ques3 {
    public static void main(String[] args) {
        // Input an email from the user. You have to create a 
        // username from the email by deleting the part that comes after 
        // ‘@’. Display that username to the user.
        // Example : 
        // email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
        // email = “helloWorld123@gmail.com”; username = “helloWorld123”

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the email: ");
        StringBuilder sb = new StringBuilder(sc.next());

        
        String username = "";
        for (int i = 0; i<sb.length(); i++){
            if (sb.charAt(i) == '@'){
                username = sb.substring(0, i);
            }
        }
        
        System.out.println("Username: " + username);
        sc.close();
        
    }
    
}
