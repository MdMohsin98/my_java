import java.util.Scanner;

public class digit_count {
    public static int count(int num1, int digit){
        int sum = 0;
        int j = num1%10;
        while (num1>0) {
            if (j == digit) {
                sum += 1;            
            }
            num1 = num1/10;            
        }
        return sum;

    }
    public static void main(String[] args) {
        // Count the particular digit in given range

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter the digit: ");
        int digit = sc.nextInt();

        int total = 0;
        int num1 = num;
        for(int i = 1; i<=num1; i++){
            total = count(i, digit);
        }

        System.out.printf("Total no. of %d between 0 and %d is = %d",digit, num, total);

        sc.close();
    }
    
}
