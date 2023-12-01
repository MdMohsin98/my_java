package bit_manipulation;

import java.util.Scanner;

public class ques4 {
    public static String decimal_to_binary(int num){
        String binary_num = "";
        while (num>0) {
            int remainder = num%2;
            binary_num = remainder+binary_num;
            num = num/2;
        }
        return binary_num;
        
    }
    public static int binary_to_decimal(String binary){
        int binary_n = 0;
        for (int i = 0; i<binary.length(); i++){
            if (binary.charAt(i) == '1') {
                binary_n = binary_n + (int)Math.pow(2,binary.length()-1-i);               
            }
        }
        return binary_n;
    }
    public static void main(String[] args) {
        // Write 2 functions => decimalToBinary() & binaryToDecimal() 
        // to convert a number from one number system to another.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a new number: ");
        int num = sc.nextInt();

        // In Binary conversion
        String binary = decimal_to_binary(num);
        System.out.printf("Binary of %d is %s\n",num,binary);

        // In decimal conversion
        int decimal = binary_to_decimal(binary);
        System.out.printf("Decimal of %s is %d",binary, decimal);

        sc.close();

    }
    
}
