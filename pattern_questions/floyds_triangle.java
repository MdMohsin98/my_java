package pattern_questions;

public class floyds_triangle {
    public static void main(String[] args) {
        // Floyd's Triangle

        int j = 5;
        int k = 1;
        for (int i = 1; i<=j; i++){
            System.out.println();
            for (int l = 1; l<=i; l++){
                System.out.print(k+" ");
                k++;
            }
        }
    }
}
