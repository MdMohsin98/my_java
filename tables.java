import java.util.Scanner;

public class tables {
    public static void createTable(int a){
        for (int i = 1;i<=10;i++){
            int j = a*i;
            System.out.println(a+" x "+i+" = "+ j);
        }
    }
    public static void main(String[] args) {
        // Make a function to print the table of a given number n.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int b = sc.nextInt();
        createTable(b);
        sc.close();
    }
    
}
