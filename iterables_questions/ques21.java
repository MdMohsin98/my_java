import java.util.Scanner;

public class ques21 {
    public static void main(String[] args) {
        // Write a program to input two integers and find their 
        // Highest Common Factor(H.C.F). For Example:  
        // INPUT: Enter 2 integers: 12 8 OUTPUT: H.C.F. = 4

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 integers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1%num2==0 || num2%num1==0){
            System.out.println("H.C.F. : " + Math.min(num1,num2));
        }
        else if(num1%num2!=0 && num2%num1!=0){
            for (int i=2; i<=Math.min(num1, num2);i++){
                if (num1%i==0 && num2%i==0) {
                    System.out.println("H.C.F. : " +i);   
                }
            }
        }
    }
}
