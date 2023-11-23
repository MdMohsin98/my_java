package Exercise_1;

import java.util.Scanner;

public class ques5 {
    public static String Voting(int age){
        String e = (age>18)? "Eligible to vote":"Not Eligible";
        return e;
    }
    public static void main(String[] args) {
        // Write a function that takes in age as input and returns if that 
        // person is eligible to vote or not. A person of age > 18 is 
        // eligible to vote.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of the person: ");
        int a = sc.nextInt();
        System.out.printf("Age = %d \n%s",a,Voting(a));
        sc.close();
    }
    
}
