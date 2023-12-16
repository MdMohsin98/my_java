import java.util.Scanner;

public class Array_2D_ques1 {
    public static void main(String[] args) {
        // Take a matrix as input and search for the given number
        // x and print the indices at which it occurs

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix.");
        System.out.print("Rows: ");
        int rows = sc.nextInt();
        System.out.print("Columns: ");
        int columns = sc.nextInt();

        int[][] array2d_practice = new int[rows][columns];
         
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i<rows; i++){
            for (int j= 0; j<columns; j++){
                array2d_practice[i][j] = sc.nextInt();
            }
        }

        // Printing the matrix
        for (int i = 0; i<rows; i++){
            System.out.println();
            for (int j = 0; j<columns; j++){
                System.out.print(array2d_practice[i][j]+" ");
            }
        }

        // Searching the particular number
        System.out.println();
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        for(int i = 0; i<rows; i++){
            for (int j=0; j<columns;j++){
                if (array2d_practice[i][j]==num) {
                    System.out.printf("Index: (%d, %d)",i,j);
                }
            }
        }
        System.out.println();
        System.out.println("Examples of Array 2D");
        sc.close();
    }
    
}
