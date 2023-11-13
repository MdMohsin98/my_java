import java.util.Scanner;

public class ques8 {
    public static void main(String[] args) {
        //Write a program to input an integer and check whether 
        // it is a prime number or not.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        int i, factors_count=0;
        for (i=1; i<= num1; i++){
            if(num1%i==0){
                factors_count = factors_count+1;
            }
        }
        // System.out.println(factors_count);
        if(factors_count==2){
            System.out.println("Prime Number");
        }
        else
        System.out.println("Not a Prime Number");
    }
    
}
