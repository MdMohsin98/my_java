package pattern_questions;

public class pyramid {
    public static void main(String[] args) {
        // Print pyramid

        for(int i = 1; i<=9;i++){
            System.out.println();
            for(int j = 9-i;j>=1;j--){
                System.out.print(" ");
            }
            for (int k = 1;k<=i;k++){
                System.out.print("* ");
            }
        }
    }
    
}
