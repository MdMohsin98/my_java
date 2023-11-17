package pattern_questions;

public class palindromic_pyramid {
    public static void main(String[] args) {
        // Palindromic Number Pyramid

        for (int i = 1; i<=9;i++){
            System.out.println();
            for(int j = 9-i;j>=1;j--){
                System.out.print("  ");
            }
            for(int k = i;k>=1;k--){
                System.out.print(k+" ");
            }
            for(int l= 2;l<=i;l++){
                System.out.print(l+" ");
            }
        }
    }
    
}
