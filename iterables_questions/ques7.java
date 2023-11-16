import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        // Write a program to input an integer and count the number of factors.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        sc.close();
        
        int i, count=0;
        for (i=1;i<=num1; i++){
            if(num1%i==0){
                count= count+1;
            }
        }
        System.out.println("Total factors: " + count);
    }
    
}
