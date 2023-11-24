import java.util.Scanner;

class Session241123_task{
    public int sum_of_digit(int num){
        // For any number
    
        int sum_of_digit = 0;
        while (num>0) {
            int digit = num%10;
            sum_of_digit = sum_of_digit+digit;
            num = num/10;
        }
        return sum_of_digit;
    }
    public int reverse_number(int num){
        
        String reversed_number = "";
        while (num>0) {
            int digit = num%10;
            reversed_number = reversed_number+digit;
            num = num/10;            
        }
        return Integer.parseInt(reversed_number);
    }
    public String checkPalindrome(int num){
        // String reversedNumber = "";
        String result;
        // while (num>0) {
        //     int digit = num%10;
        //     reversedNumber = reversedNumber+digit;
        //     num = num/10;            
        // }
        // int reversedNumber2 = Integer.parseInt(reversedNumber);
        // result = (reversedNumber2==num) ? "Palindrome Number.": "Not Palindrome";
        result = (reverse_number(num)==num)? "Palindrome":"Not Palindrome";
        return result;
    }
    public String checkPrime(int num){
        int factors = 0;
        for (int i = 1; i<=num; i++){
            if (num % i==0){
                factors = factors+1;
            }
        }
        if (factors==2) {
            return "Prime Number";
        }
        else{
            return "Not a prime number.";
        }
    }
    public String checkEvenOdd(int num){
        String result = (num%2==0)?"Even":"Odd";
        return result;
    }
}


public class Session241123 {
    public static void main(String[] args) {
        // Create a class to solve the problems given
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Session241123_task st = new Session241123_task();
        // Sum of Digits
        System.out.println("Sum of digit: "+st.sum_of_digit(num));
        // Reverse Number
        System.out.println("Reversed Number: "+st.reverse_number(num));
        // Check Palindrome
        System.out.println(st.checkPalindrome(num));
        // Check Prime
        System.out.println("Is Prime: "+st.checkPrime(num));
        // Check Even Odd
        System.out.println("Even or Odd: " + st.checkEvenOdd(num));
        sc.close();
    }
    
}
