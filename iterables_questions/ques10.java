import java.util.Scanner;

public class ques10 {
    public static void main(String[] args) {
        //Write a program to input 10 integers and find the sum of even 
        //numbers only.

        Scanner sc = new Scanner(System.in);
        
        int i=1, sum=0;
        while (i<=10) {
            System.out.print("Enter Number "  +i+ " = ");
            int num = sc.nextInt();
            if (num%2==0){
                sum = sum+num;
            }
            i++;
        }
        System.out.println("Total Sum: " + sum);
        sc.close();

    }
    
}
