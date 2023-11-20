package pattern_questions;

public class hollow_rhombus {
    public static void main(String[] args) {
        // Hollow Rhombus
        int rows = 8;
        for (int i = 1;i<=rows;i++){
            System.out.println();
            for(int j = rows-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k = 1;k<=rows;k++){
                if (k==1 || i==1 || k==rows || i== rows) {
                    System.out.print("*");                    
                }
                else{
                    System.out.print(" ");
                }
            }
        }

    }
    
}
