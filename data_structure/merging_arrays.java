package data_structure;

import java.util.Arrays;
import java.util.Scanner;

public class merging_arrays {
    public static void main(String[] args) {
        // Merging two arrays

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of 1st Array: ");
        int size1 = sc.nextInt();

        System.out.print("Enter the size of 2nd Array: ");
        int size2 = sc.nextInt();

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        System.out.println("Enter the elements for 1st Array");
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements for 2nd Array");
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        int total_size = arr1.length + arr2.length;
        int[] merged_array = new int[total_size];

        for (int i = 0; i<arr1.length; i++){
            merged_array[i] = arr1[i];
        }

        for (int i = 0; i<arr2.length; i++){
            merged_array[arr1.length+i] = arr2[i];
        }

        System.out.println("Final Array is as below.");

        System.out.println(Arrays.toString(merged_array));

        sc.close();
    }
    
}
