package pattern_questions;

public class butterfly {
    public static void main(String[] args) {
        // Butterfly Pattern

        int rows = 4;
        // First Part
        for (int i = 1;i<=rows;i++){
            System.out.println();
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            for(int m = 2*(rows-i);m>=1;m--){
                System.out.print(" ");
            }
            for (int k = 1;k<=i;k++){
                System.out.print("*");
            }
        }
        // Second Part
        for (int i = rows;i>=1;i--){
            System.out.println();
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            for(int m = 2*(rows-i);m>=1;m--){
                System.out.print(" ");
            }
            for (int k = 1;k<=i;k++){
                System.out.print("*");
            }
        }
    }
    
}
