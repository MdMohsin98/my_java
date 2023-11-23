package Exercise_1;

import java.util.Scanner;

public class ques4 {
    public static double Circumference(int r){
        return 2*Math.PI*r;
    }
    public static void main(String[] args) {
        // Write a function that takes in the radius as input and 
        //returns the circumference of a circle.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int n = sc.nextInt();
        System.out.println("Circumference: "+Circumference(n));
        sc.close();
    }
    
}
