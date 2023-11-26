import java.util.Scanner;

public class Arrays_2D {
    public static void main(String[] args) {
        // 2D - Arrays in Java

        // Defining 2D Arrays
        // type[][] arrayName = new type[rows][columns]

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of the Array: ");
        int row = sc.nextInt();
        int column = sc.nextInt();
        
        // initializing new 2D array

        int array_2d[][] = new int[row][column];
        
        System.out.println("Enter the elements: ");
        for (int i = 0; i<row;i++){
            for(int j = 0; j<column;j++){
                array_2d[i][j] = sc.nextInt();
            }
        }

        // Printing the 2d array

        System.out.println("The Matrix is below. ");

        for (int i = 0; i<row;i++){
            System.out.println();
            for(int j = 0; j<column; j++){
                System.out.print(array_2d[i][j]+"  ");
            }
        }
        sc.close();
    }
    
}
