import java.util.Scanner;

import javax.swing.text.Style;

public class special_two_digit {
    public static void main(String[] args) {
        // Special Two digit number

        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int a = sc.nextInt();

        // if (a<100 && a>9){
        //     int digit1 = a/10;
        //     int digit2 = a%10;
        //     if ((digit1+digit2)+(digit1*digit2)==a) {
        //         System.out.println("Special Number");                
        //     }
        //     else
        //     System.out.println("Enter another number.");

        
        //  }

        String result = (a<0)? "Negative":"Positive";
        System.out.println(result);
        }
    }

