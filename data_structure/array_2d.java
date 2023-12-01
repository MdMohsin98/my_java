package data_structure;

import java.util.Scanner;

public class array_2d {
    public static void main(String[] args) {
        // Write a programme to create a 2D array

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns value: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr_2d = new int[rows][cols];
        System.out.println("Enter the values of rows and columns: ");

        for (int i = 0; i < rows ; i++){
            for (int j = 0; j<cols; j++){
                arr_2d[i][j] = sc.nextInt();
            }
        }

        // Printing the array

        System.out.println("The array is following.");
        for (int i = 0; i<rows; i++){
            System.out.println();
            for (int j=0; j<cols; j++){
                System.out.print(arr_2d[i][j]+" ");
            }
        }
        sc.close();
    }
    
}
