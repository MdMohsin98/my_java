import java.util.Scanner;

class PerfectNumber{
    Scanner sc = new Scanner(System.in);
    public void check_perfect(){
        int sum = 0;
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i=1;i<num;i++){
            if (num%i==0){
                // System.out.println(i+" ");
                sum = sum + i;
            }
        }
        if (sum==num) {
            System.out.println("Perfect Number");            
        }
        else{
            System.out.println("Not a perfect number");
        }
    }
}

class PalindromeNumber{
    Scanner sc = new Scanner(System.in);
    public void check_palindrome(){
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original_number = num;
        int reverse_number = 0;
        while (num>0) {
            int digit = num%10;
            reverse_number = reverse_number*10+digit;
            num = num/10;            
        }
        if (reverse_number==original_number) {
            System.out.println("Palindrome Number.");                
        }
        else{
            System.out.println("Not a Palindrome.");
        }
    }
}

public class ques22 {
    public static void main(String[] args) {
        // Write a menu driven class to accept a number from the user and 
        // check whether it is a Palindrome or a Perfect number.
        // a.) Palindrome number- (a number is a Palindrome which when read in
        // reverse order is same as read in the right order) 
        // Example: 11, 101, 151, etc. b.) Perfect number- (a number is called 
        // Perfect if it is equal to the sum of its factors other than
        // the number itself.) Example: 6=1+2+3

        // Checking Perfect number
        PerfectNumber pfn = new PerfectNumber();
        pfn.check_perfect();

        // Checking Palindrome Number
        PalindromeNumber pln = new PalindromeNumber();
        pln.check_palindrome();
    }
}
