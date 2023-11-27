package Strings_YT;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        // Input an email from the user. You have to create a 
        // username from the email by deleting the part that comes after 
        // ‘@’. Display that username to the user.
        // Example : 
        // email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
        // email = “helloWorld123@gmail.com”; username = “helloWorld123”

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = sc.next();

        String[] email1 = new String[2];
        if (email.contains("@")) {
            email1 = email.split("@"); 
            System.out.println("username: "+email1[0]);           
        }
        else{
            System.out.println("Enter valid email.");
        }
        sc.close();

    }
    
}
