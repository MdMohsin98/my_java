import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int a = sc.nextInt(); // Taking input as integer
        int age = 2023 - a;
        System.out.print("Enter your marks: ");
        float marks = sc.nextFloat(); // Taking input as float
        System.out.print("Enter your Name: ");
        String name1 = sc.nextLine(); // Taking input as single word string
        // System.out.print("Tell me about yourself: ");
        // String intro = sc.nextLine(); // Taking input as single line
        System.out.println("================================");
        System.out.println("Your name is : " + name1);
        // System.out.println("My Intro: " +intro);
        System.out.println("Your current age = " + age);
        System.out.println("Your marks are : "+ marks);

        sc.close();
    }
    
}
