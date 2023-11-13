import java.util.Scanner;

public class ques12 {
    public static void main(String[] args) {
        // Write a program to input 10 integers and display the largest integer.

        Scanner sc = new Scanner(System.in);

        int i, max_num = 0;
        for (i=1;i<=10;i++){
            System.out.print("Enter number " +i+" = ");
            int num = sc.nextInt();
            if (num>max_num){
                max_num = num;
            }
        }
        System.out.println("Max Number " + max_num);

    }
    
}
