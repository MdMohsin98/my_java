import java.util.Scanner;

public class no_of_digits {
    public static int digits(int num){
        int num1 = num;
        int digit = 0;
        while (num1>0) {
            num1 = num1/10;
            digit += 1;           
        }
        return digit;

    }
    public static void main(String[] args) {
        // How many digits are there from 1 to a given number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int total_digit = 0;
        for(int i = 1; i<=num; i++){
            total_digit += digits(i);

        }

        System.out.println("Total digits = "+total_digit);
    }
    
}
