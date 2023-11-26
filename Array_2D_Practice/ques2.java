package Array_2D_Practice;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        // Print the transpose of the matrix

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrixs");
        System.out.print("Rows: ");
        int rows = sc.nextInt();
        System.out.print("Cols: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements");
        for (int i = 0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Print the matrix");
        for (int i = 0; i<rows; i++){
            System.out.println();
            for (int j = 0; j<cols; j++){
                System.out.print(matrix[i][j]+" ");
            }
        }

        System.out.println();
        System.out.println("Transpose of the matrix");
        for (int i = 0; i<rows; i++){
            System.out.println();
            for (int j = 0; j<cols; j++){
                System.out.print(matrix[j][i]+" ");
            }
        }
        sc.close();
    }
    
}
