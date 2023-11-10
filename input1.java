import java.util.Scanner;

public class input1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks of PCM");
        System.out.println("Physics: ");
        int p = sc.nextInt();
        System.out.println("Chemistry: ");
        int c = sc.nextInt();
        System.out.println("Math: ");
        int m = sc.nextInt();
        int total = p + c + m;
        System.out.println("Total Marks are: " + total);

    }
}

