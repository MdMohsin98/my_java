package data_structure;

import java.util.Arrays;
import java.util.Scanner;

public class delete_element {
    public static void main(String[] args) {
        // Deleting elements from an array

        int[] arr1 = {1, 2, 4, 5, 6};

        int[] new_arr =new int[arr1.length-1];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index of element: ");
        int index = sc.nextInt();

        for(int i = 0; i< arr1.length; i++){
            if (i<index) {
                new_arr[i] = arr1[i];        
            }
            if (i>index) {
                new_arr[i-1] = arr1[i];
            }
        }

        System.out.println(Arrays.toString(new_arr));
        sc.close();
    }
    
}
