package pattern_questions;

public class practice {
    public static void main(String[] args) {
        // Number pyramid

        int rows =5;
        
        for (int i = 1;i<=rows;i++){
            System.out.println();
            for(int j = rows-i; j>=1;j--){
                System.out.print("  ");
            }
            for(int k = i; k>=1;k--){
                System.out.print(k+" ");
            }
            for (int l = 1;l<=i;l++){
                System.out.print(l+" ");
            }
        }
        }
    }
