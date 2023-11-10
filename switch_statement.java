import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {
        // switch statement
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number 1-7: ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
            System.out.println("Wednesday to Sunday");
            break;
            }
        // Another Example
            System.out.print("Enter Any No. 1-3: ");
            int abc = sc.nextInt();

            switch (abc) {
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
                    System.out.println("Rijaan babu");
                    break;
                default:
                    System.out.println("Stop call");
                    break;
        }

    }
}