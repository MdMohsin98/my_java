import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        // Switch Case

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Khushboo");
                break;
            case 2:
                System.out.println("Rehan");
                break;
            case 3:
                System.out.println("Suhana");
                break;
            case 4:
                System.out.println("Rijaan");
                break;
            default:
                System.out.println("Mohsin");
                break;
        }
        sc.close();
    }
    
}
