import java.util.Scanner;

public class exception_handling {
    public static void main(String[] args) {
        // Exception Handling 
        // try - catch

        int[] ages = {12, 7, 5};
        Scanner sc  = new Scanner(System.in);
        try {
            System.out.print("Enter the index: ");
            int a = sc.nextInt();
            System.out.println(ages[a]);
        } catch (Exception exception) {
            // To handle exception
            System.out.println("List Index out of bound.");
            System.out.println("Enter the value within the range.");
        }
        sc.close();
    }
    
}
