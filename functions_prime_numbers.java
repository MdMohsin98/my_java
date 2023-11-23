import java.util.Scanner;

public class functions_prime_numbers {
    public static boolean checkPrime(int a){
        int b = 0;
        for (int i = 1; i<=a; i++){
            if (a%i==0) {
                b = b+1;
            }
        }
        boolean c = (b==2)? true:false;
        return c;
    }
    public static void main(String[] args) {
        // Make a function to check if a number is prime or not.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.printf("The number %d is prime? ==> %s",a,checkPrime(a));
        sc.close();
    }
    
}
