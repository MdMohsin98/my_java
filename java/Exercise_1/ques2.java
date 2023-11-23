package Exercise_1;
import java.util.Scanner;
public class ques2 {
    public static int sum_odd(int n){
        int sum1 = 0;
        for (int i = 1; i<=n; i++){
            if (i%2==1){
                sum1 = sum1+i;
            }
        }
        return sum1;
    }
    public static void main(String[] args) {
        // Write a function to print the sum of 
        // all odd numbers from 1 to n.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.printf("The sum of odd numbers between 1 and %d is %d",n,sum_odd(n));
        sc.close();
    }
    
}
