import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any number: ");
        int a = sc.nextInt();
        while (a<=10) {
            System.out.println("Iteration: " + a);
            a++;
        }

        // Another Example
        int b = 100;
        int c = 1;
        System.out.println("================");
        while (c<=b) {
            System.out.println(c);
            c++;   
        }

        // Another Example
        System.out.println("===========");
        int d = 100;
        while (d>0) {
            System.out.println(d);
            d--;
            
        }
    }
    
}
