package Arrays_Practice;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        // Find the maximum & minimum number in an array of integers.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];
        System.out.println("Enter the elements");
        for (int i = 0;i<size; i++){
            numbers[i] = sc.nextInt();
        }
        int min_n = Integer.MAX_VALUE, max_n = Integer.MIN_VALUE;
        for (int i = 0;i<size;i++){
            if (numbers[i]<min_n) {
                    min_n = numbers[i];
                }
            if (numbers[i]>max_n){
                max_n = numbers[i];
            }
        }
        System.out.println("Minimum Numer: "+min_n);
        System.out.println("Maximum Number: "+max_n);
        sc.close();

    } 
}
