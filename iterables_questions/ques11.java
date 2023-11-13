import java.util.Scanner;

public class ques11 {
    public static void main(String[] args) {
        // Write a program to input 10 integers and find the sum of two digit 
        // as well as three digit numbers separately.

        Scanner sc = new Scanner(System.in);

        int i, sum_2 = 0, sum_3 = 0, sum = 0;

        for(i=1; i<=10; i++){
            System.out.print("Enter number " +i+" = ");
            int num = sc.nextInt();

            // For two digit numbers
            if (num>=10 && num<100) {
                sum_2 = sum_2+num;                
            }
            // For three digit numbers
            else if(num>=100 && num<1000){
                sum_3 = sum_3+num;
            }
            else{
                sum = sum + num;
            }
        }
        System.out.println("Sum of Two digit nos.: " + sum_2);
        System.out.println("Sum of Three digit nos.: " + sum_3);
        System.out.println("Sum of the other numbers: " + sum);
    }
}
