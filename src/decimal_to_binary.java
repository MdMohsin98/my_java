import java.util.Scanner;

public class decimal_to_binary {
    public static void main(String[] args) {
        // Write to program to convert a decimal number to binary

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original_num = num;
        String binary_number = "";
        while (num>0) {
            int remainder = num%2;
            binary_number = remainder+binary_number;
            num = num/2;
        }
        
        System.out.println("Original Number: "+original_num+", Binary Number: "+binary_number);

        
        // System.out.printf("Octal Number of %d is %s\n",num, Integer.toOctalString(num));
        // System.out.printf("Hexadecimal of %d is %s\n",num,Integer.toHexString(num));
        
        // Another method to convert decimal to binary
        System.out.println("Another Method");
        String binary_n = Integer.toBinaryString(original_num);
        System.out.printf("Original Number: %d, Binary Number: %s\n", original_num,binary_n);
        sc.close();
    }   
}
