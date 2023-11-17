import java.util.Scanner;

public class wrapper_class {
    public static void main(String[] args) {
        // Wrapper class in java

        int i = 10;
        // Integer j = new Integer(10); // Wrapper Class - Old Model
        Integer k = Integer.valueOf(20); // Wrapper Class
        Integer l = 50;                    // Wrapper Class
        System.out.println(k);
        System.out.println(i);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name1 = sc.nextLine();
        double a = sc.nextDouble();
        int b = sc.nextInt();
        System.out.println(name1);
        System.out.println(a);
        System.out.println(b);
        sc.close();

    }
    
}
