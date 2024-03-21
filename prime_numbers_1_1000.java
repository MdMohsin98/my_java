import java.util.Scanner;

public class prime_numbers_1_1000 {
    public static String prime_n(int a){
        int factors = 0;
        for(int i = 1; i<=a; i++){
            if (a%i==0) {
                factors+=1;                
            }
        }
        String result = (factors == 2)? "Prime No.": "Not a Prime No.";
        return result;
    }
    public static void main(String[] args) {
        // Prime numbers between 1 to 1000
        System.out.println("Prime numbers between 1 to 1000");
        for (int j = 2; j<=1000; j++){
            if (prime_n(j)=="Prime No.") {
                System.out.println(j);               
            }
            // System.out.println(j + " is a " + prime_n(j));
        }

        
    }
    
}
