package strings_ques;

import java.util.Arrays;
import java.util.Scanner;

public class new_file {

    public static int[] merge_arrays(int[] arr1, int[] arr2){

        int size = arr1.length+arr2.length;
        int[] newArray = new int[size];

        for (int i = 0; i<arr1.length; i++){
            newArray[i] = arr1[i];
        }
        for(int i = 0; i<arr2.length; i++){
            newArray[arr1.length+i] = arr2[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        // Static Arrays
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {3,43,12,32,34};
        int[] arr2 = {3,5,4,2,5,5, 7, 562, 45};
        // int size = arr1.length+arr2.length;
        // int[] newArray = new int[size];

        // for (int i = 0; i<arr1.length; i++){
        //     newArray[i] = arr1[i];
        // }
        // for(int i = 0; i<arr2.length; i++){
        //     newArray[arr1.length+i] = arr2[i];
        // }
        // System.out.println(Arrays.toString(newArray));
 
        int[] arr = merge_arrays(arr1, arr2);
        System.out.println(Arrays.toString(arr));
        sc.close();

    }
}
