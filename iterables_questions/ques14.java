import java.util.Scanner;

public class ques14 {
    public static void main(String[] args) {
        // Write a program to input 10 integers and display the largest 
        // even integer.  In case there is no even integer, it should 
        // print “No even integer found”.

        Scanner sc = new Scanner(System.in);

        int i, max_num= Integer.MIN_VALUE;

        for (i=1; i<=10;i++){
            System.out.print("Enter number " +i+ " = ");
            int num = sc.nextInt();
            if (max_num<num) {
                max_num = num;                
            }
        }
        if (max_num%2==0){
            System.out.println("Largest Even Integer: " +max_num);
        }
        else{
            System.out.println("No even integer found");
        }
    }
    
}
