package pattern_questions;

public class inverse_pyramid {
    public static void main(String[] args) {
        // Inverse Pyramid

        int rows = 5;
        for (int i = rows; i>=1;i--){
            System.out.println();
            for (int j = rows-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print("* ");
            }
        }
    }
    
}
