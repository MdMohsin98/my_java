import java.util.Scanner;

public class fns_even_odd {
    public static String checkEvenOdd(int a){
        String s = (a%2==0)?"Even":"Odd";
        return s;
    }
    public static void main(String[] args) {
        // Make a function to check if a given number n is even or not.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.println(checkEvenOdd(a));
        sc.close();
    }   
}
