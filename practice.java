public class practice {
    public static void main(String[] args) {
        // Practice
        // Sum of digits

        int a = 123456789, sum_of_digit = 0;
        while (a>0) {
            int digit = a%10;
            sum_of_digit = sum_of_digit+digit;
            a = a/10;
        }
        // System.out.println("Sum of digits: "+sum_of_digit);
        System.out.println("Total Sum: "+sum_of_digit);
    }
    
}
