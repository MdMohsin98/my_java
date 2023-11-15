import java.util.Scanner;

public class mini_project {
    public static void main(String[] args) {
        // Mini Project
        int a = (int)(Math.random()*100);
        a = (int)a;
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter Any Number: ");
            double b = sc.nextDouble();
            if (b < 0){
                System.out.println("Original  Number is: " + a);
                break;
            }
            else if (b>100) {
                System.out.println("Number should be 1-100");
            }
            else if (b>a)
            System.out.println("Number is greater");
            else if(b<a)
            System.out.println("Number is small.");
            else if(b==a){
                System.out.println("Correct Match");
                break;
            }            
        }
        sc.close();          
    }
}
