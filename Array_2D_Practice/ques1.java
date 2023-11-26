package Array_2D_Practice;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        // Print the spiral order matrix as output for a given 
        // matrix of numbers.
        System.out.println("Enter the size of the matrix.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int rows = sc.nextInt();
        System.out.print("Columns: ");
        int columns = sc.nextInt();

        // initializing array

        int[][] array_spiral = new int[rows][columns];

        System.out.println("Enter the elements");
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<columns; j++){
                array_spiral[i][j] = sc.nextInt();                
            }
        }
        
        System.out.println("The spiral order matrix is below");

        int row_start = 0;
        int row_end = rows-1;
        int column_start = 0;
        int column_end = columns-1;

        while (row_start <= row_end && column_start <= column_end) {
            // 1
            for(int col = column_start; col <= column_end; col++){
                System.out.print(array_spiral[row_start][col]+" ");
            }
            row_start++;

            // 2
            for (int row = row_start; row<= row_end; row++){
                System.out.print(array_spiral[row][column_end]+" ");
            }
            column_end--;

            // 3
            for (int col = column_end; col >= column_start; col--){
                System.out.print(array_spiral[row_end][col]+" ");
            }
            row_end--;

            // 4
            for (int row = row_end; row>=row_start;row--){
                System.out.print(array_spiral[row][column_start]+" ");
            }
            column_start++;

            System.out.println();
            
        }
        sc.close();
    }
    
}
