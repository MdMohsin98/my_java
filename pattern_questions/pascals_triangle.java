package pattern_questions;

public class pascals_triangle {
    public static void main(String[] args) {
        // Pascals Triangle

        int rows = 6;
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<rows-i-1;j++){
                System.out.print("  ");
            }
            int value = 1;
            for(int k = 0; k<=i;k++){
                System.out.printf("%4d",value);
                value = value*(i-k)/(k+1);
            }
            System.out.println();
        }
    }
    
}
