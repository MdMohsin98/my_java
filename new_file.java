import java.util.Scanner;

public class new_file {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int n, even_sum=0, odd_sum=0, neg_sum=0;
        
        do {
            System.out.print("Enter a number : ");
            n = sc.nextInt();
            if (n>0 && n%2==0) {
                even_sum += n;                
            }
            else if (n>0 && n%2==1) {
                odd_sum += n;
            }
            else if (n<0) {
                neg_sum += n;                
            }
            
        } while (n!=0);

        System.out.println("Sum of Even: " + even_sum);
        System.out.println("Sum of Odd: " + odd_sum);
        System.out.println("Sum of Negative: " + neg_sum);
        
        

        sc.close();
    }
}