import java.util.Scanner;

public class ques19 {
    public static void main(String[] args) {
        // Write a program to input an integer and check whether it is 
        // perfect, abundant or deficient number. If the sum of the factors 
        // excluding itself is equal to that number it is perfect, if greater 
        // than that number it is abundant and if less than that number 
        // it is deficient number.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum_fact = 0;
        for(int i=1; i<num;i++){   // Finding factors excluding the number itself
            if (num%i==0) {
                System.out.print(i+" ");
                sum_fact = sum_fact+i;
            }
        }
        System.out.println();
        if (sum_fact==num) {
            System.out.println("Perfect Number");            
        }
        else if (sum_fact>num) {
            System.out.println("Abundant Number");
        }
        else if (sum_fact<num) {
            System.out.println("Deficient Number");            
        }
    }
}
