import java.util.Scanner;

public class ques20 {
    public static void main(String[] args) {
        // Write a program to input two integers and find their Least Common
        // Multiple(L.C.M). For Example, INPUT: Enter 2 integers: 12 and 8
        // OUTPUT: L.C.M. = 24

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1%num2==0 || num2%num1==0) {
            System.out.println("L.C.M. = "+ Math.max(num1, num2));
        }
        else{
            for(int i=1;i<=(num1*num2);i++){
                if (i%num1==0 && i%num2==0) {
                    System.out.println("L.C.M. = " + i);
                    break;
                }
            }

        }
    }
}
