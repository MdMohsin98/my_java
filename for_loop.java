import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        //Loops
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        double a = sc.nextDouble();
        for (int i = 1; i<=a; i++)
        System.out.println("Iteration " + i);

        // Another Example

        // print 100 - 1
        for (int j = 100; j>=1; j--)
        System.out.println(j);

        sc.close();

    }
    
}
