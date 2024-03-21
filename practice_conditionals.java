import java.util.Scanner;

public class practice_conditionals {
    public static void triangle(int num1, int num2, int num3){
        if (num1 < (num2+num3) && num2 < (num1+num3) && num3 < (num2+num1)){
            System.out.println("Can make a triangle.");
            if (num1*num1 < (num2*num2+num3*num3) && num2*num2 < (num1*num1+num3*num3) && num3*num3 < (num1*num1+num2*num2)) {
                System.out.println("Can form acute angled triangle.");                
            }
            if (num1*num1 > (num2*num2+num3*num3) || num2*num2 > (num1*num1+num3*num3) || num3*num3 > (num1*num1+num2*num2)){
                System.out.println("Can form obtuse angled triangle.");
            }
            if (num1*num1 == (num2*num2+num3*num3) || num2*num2 == (num1*num1+num3*num3) || num3*num3 == (num1*num1+num2*num2)){
                System.out.println("Can form right angled triangle.");
            }

        }
        else{
            System.out.println("Can't make a triangle.");
        }

    }
    public static void main(String[] args) {
        // Write a program to accept three sides of a triangle as parameter 
        // and check whether it can form a triangle or not. If it forms a 
        // triangle, check whether it is an acute angled,obtuse angled or 
        // right-angled triangle.
        // (Hint: To form a triangle, each side should be less the sum of the other two sides)
        // 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of sides of triangle : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        triangle(num1, num2, num3);

        sc.close();

    }
    
}
