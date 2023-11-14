import java.util.Scanner;

public class ques15 {
    public static void main(String[] args) {
        // Write a program to input 10 integers and check whether all 
        // the entered numbers are even numbers or not.

        Scanner sc = new Scanner(System.in);

        int i, num, even_num=0;
        for (i=1;i<=10;i++){
            System.out.print("Enter number "+i+" = ");
            num = sc.nextInt();
            if (num%2==0) {
                even_num = even_num+1;
            }
        }
        if (even_num==10) {
            System.out.println("All numbers are even.");
        }
        else{
            System.out.println("All numbers are not even.");
        }
        sc.close();
        }
        
    }
