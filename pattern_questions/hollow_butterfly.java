package pattern_questions;

public class hollow_butterfly {
    public static void main(String[] args) {
        // Hollow butterfly
        
        int rows = 5;

        // Upper Part

        for (int i = 1;i<=rows;i++){
            System.out.println();
            for(int j = 1;j<=i;j++){
                if (i==1 || j==i || j==1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int k = 2*(rows-i);k>=1;k--){
                System.out.print(" ");
            }
            for(int l = 1;l<=rows;l++){
                if (l==1 || l==i+5 || l==10 || i == l) {
                    System.out.print("*");                    
                }
                else{
                    System.out.print(" ");
                }
            }

        }
        
        // Lower Part
        for (int i = rows;i>=1;i--){
            System.out.println();
            for(int j = 1;j<=i;j++){
                if (i==1 || j==i || j==1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int k = 2*(rows-i);k>=1;k--){
                System.out.print(" ");
            }
            for(int l = 1;l<=rows;l++){
                if (l==1 || l==i+5 || l==10 || i == l) {
                    System.out.print("*");                    
                }
                else{
                    System.out.print(" ");
                }
            }

        }

    }
    
}
