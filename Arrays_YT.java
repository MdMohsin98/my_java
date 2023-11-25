import java.util.Scanner;

public class Arrays_YT {
    public static void main(String[] args) {
        // Arrays 

        // type[] arrayName = new type[size];
        
        int[] marks = new int[3];
        marks[0] = 25;
        marks[1] = 35;
        marks[2] = 40;
        // System.out.println(marks[0]);
        for (int i = 0;i<marks.length;i++){
            System.out.println("Marks: "+marks[i]);
        }

        // Another way to define Array

        System.out.println("Another Way to define Array.");
        int[] marks2 = {12,13,14};
        System.out.println(marks2[0]);
        System.out.println(marks2[1]);
        System.out.println(marks2[2]);

        System.out.println("Array using user input.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int marks3[] = new int[size];

        System.out.printf("Enter %d elements: ",size);
        for (int i = 0; i< size; i++){
            marks3[i] = sc.nextInt();
        }
        System.out.println("New Array Elements.");
        for (int i = 0 ; i<size;i++){
            System.out.println(marks3[i]);
        }
        sc.close();
    }
    
}
