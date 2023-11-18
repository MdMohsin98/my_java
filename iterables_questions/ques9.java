import java.util.Scanner;

public class ques9 {
    public static void main(String[] args) {
        // Write a program to input 10 integers and find their sum.
        Scanner sc = new Scanner(System.in);
        
        int i, sum=0;
        for (i=1;i<=10;i++){
            System.out.print("Number "+i+" = ");
            int num = sc.nextInt();
            sum = sum+num;
        }
        
        System.out.println("Total sum: " + sum);
        
    }
    
}
