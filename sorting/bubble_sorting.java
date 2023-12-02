package sorting;

import java.util.Arrays;

public class bubble_sorting {
    public static void printArray(int[] nums){
        System.out.println(Arrays.toString(nums));

    }
    public static void main(String[] args) {
        // Different types of sorting
        // Bubble sort
        // Selection sort
        // Insertion sort

        // 1. Bubble Sort
        // Time complexity ==> O(n^2)
        int[] nums = {7,8,3,1,2};
        
        for (int i=0; i<nums.length-1; i++){
            for (int j = 0; j<nums.length-i-1; j++){
                if (nums[j]>nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
            }

            }
        }
        printArray(nums);
    }

    
}