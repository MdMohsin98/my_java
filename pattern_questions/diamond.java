package pattern_questions;

public class diamond {
    public static void main(String[] args) {
        // Diamond Pattern

        // Upper Half
        int rows = 6;
        for (int i = 1;i<=rows;i++){
            System.out.println();
            for(int j = rows-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print("* ");
            }
        }
        // Lower Half
        for (int i = rows-1;i>=1;i--){
            System.out.println();
            for(int j = rows-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print("* ");
            }
        }
    }
    
}
