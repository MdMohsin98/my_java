import java.util.Scanner;

public class do_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int a = sc.nextInt();
        do {
            System.out.println("Iteration: " + a);
            a++;
        } while (a <= 10);

        // Another Example
        // Print 100 to 1

        int b = 100;
        do {
            System.out.println(b);
            b--;
        } while (b>0);

        // Exercise
        int c = 0;
        do {
            System.out.print("Enter any number: ");
            c = sc.nextInt();
            System.out.println("You entered: " +c);
        } while (c>=0);
        System.out.println("The End!");
        sc.close();
    }
    
}
