package Arrays_Practice;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        // Take an array of numbers as input and check if it is 
        // an array sorted in ascending order.
        // Eg : { 1, 2, 4, 7 } is sorted in ascending order.
        // {3, 4, 6, 2} is not sorted in ascending order.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Input the elements: ");
        for (int i = 0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        int ascending = 0;
        for (int i = 1; i<size; i++){
            if (numbers[i-1]<numbers[i]) {
                ascending = ascending+1;
            }
        }
        if (ascending==size-1){
            System.out.println("Ascending Order");
        }
        else{
            System.out.println("Not in Ascending Order");
        }
        sc.close();

    }
    
}
