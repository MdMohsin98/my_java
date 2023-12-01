package data_structure;

import java.util.Arrays;
import java.util.Scanner;

public class adding_element {
    public static void main(String[] args) {
        // Inserting a element from an array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        
        System.out.println("Enter the elements of array.");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        // Entering the element on the particular index
        int[] new_arr = new int[size+1];

        System.out.print("Enter the index of the element: ");
        int index = sc.nextInt();
        System.out.print("Enter the value: ");
        new_arr[index] = sc.nextInt();

        for(int i = 0; i<size; i++){
            if (i<index) {
                new_arr[i] = arr[i];
            }
            else if (i>=index) {
                new_arr[i+1] = arr[i];
            } 
        }

        System.out.println("Final array is : " + Arrays.toString(new_arr));
        sc.close();
    }
    
}
