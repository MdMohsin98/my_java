import java.util.Scanner;

public class ques13 {
    public static void main(String[] args) {
        // Write a program to input 10 integers and display the largest 
        // as well as the smallest integer.

        Scanner sc = new Scanner(System.in);

        int i, max_num = Integer.MIN_VALUE, min_num = Integer.MAX_VALUE;

        for (i = 1; i<=10; i++){
            System.out.print("Enter number " +i+ " = ");
            int num = sc.nextInt();
            if(max_num<num){
                max_num = num;
            }
            if(min_num>num){
                min_num = num;
            }
        }
        System.out.println("Minimum number: "+min_num);
        System.out.println("Maximum number: "+max_num);

    }
    
}
