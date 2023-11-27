package Strings_YT;

import java.util.Scanner;

public class strings_yt {
    public static void main(String[] args) {
        // String Declarations
        String name = "Mohammad Mohsin";
        String intro = "Student at TMBU, BCA";

        // User Input of the strings
        // For single word sc.next()
        // For one complete line sc.nextLine()

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name and class: ");
        String fname = sc.nextLine();
        String standard = sc.nextLine();
        System.out.println("=========================");
        System.out.println("Name: " + fname);
        System.out.println("Class: "+ standard);

        // String Manipulation
        // Concatenation
        
        // 1st Option
        String full_name = name + " " + intro;
        System.out.println(full_name); 

        // 2nd Options
        System.out.println(name.concat(intro));

        // Length of the String

        System.out.println("Length of full Name: "+full_name.length());

        // Print each characters separately

        String[] letters = full_name.split("");
        for (int i=0; i<letters.length; i++){
            System.out.print(letters[i]+" ");
        }

        // Another way to print each characters separately
        
        System.out.println();
        System.out.println("Another Way");
        for (int i = 0; i<full_name.length();i++){
            System.out.print(full_name.charAt(i)+"  ");
        }

        sc.close();

    }
    
}
