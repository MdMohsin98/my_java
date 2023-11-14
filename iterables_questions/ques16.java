import java.util.Scanner;

public class ques16 {
    public static void main(String[] args) {
        // Write a program to input 10 integers and check whether all the 
        // entered numbers are same or not.
        // For Example,
        // INPUT: Enter 10 numbers: 10 12 13 234 45 34 67 78 76 12
        // OUTPUT: All numbers are not same.
        // INPUT: Enter 10 numbers: 12 12 12 12 12 12 12 12 12 12
        // OUTPUT: All numbers are same.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 = ");
        int reference_num = sc.nextInt();

        // Take input of other numbers

        int i, num, count_num=0;
        for(i=2;i<=10;i++){
            System.out.print("Enter number " +i+" = ");
            num = sc.nextInt();
            if (num == reference_num) {
                count_num = count_num+1;
            }
        }
        if (count_num==9) {
            System.out.println("All numbers are same.");
        }
        else{
            System.out.println("All numbers are not same.");
        }
    }
    
}
