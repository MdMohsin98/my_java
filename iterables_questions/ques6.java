import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        // Write a program to input an integer and print its factors.
        // For Example,
        // INPUT: Enter an integer:12
        // OUTPUT: Factors: 1 2 3 4 6 12

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int i, factors=1;
        for (i=1; i<=num1; i++){
            if (num1%i==0){
                System.out.print(i+" ");
            }
        }

    }
    
}
