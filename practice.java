public class practice {
    public static void main(String[] args) {
        // Practice
        int a = 123456789, sum_of_digit = 0;
        // Write the sum of digits
        
        // for (int i = 1;i<=10;i++){
        //     int digit = a%10;
        //     sum_of_digit = sum_of_digit+digit;
        //     a = a/10;
        //     // System.out.print(digit+"");
        // }
        // Count of total digits
        int digits_count = 0;
        while (a>0) {
            // int digit = a%10;
            a = a/10;
            digits_count = digits_count+1;
        }
        // System.out.println("Sum of digits: "+sum_of_digit);
        System.out.println("Total Count: "+digits_count);
    }
    
}
