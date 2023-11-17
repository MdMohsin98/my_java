package pattern_questions;

public class rhombus {
    public static void main(String[] args) {
        // Rhombus pattern

        for (int i = 1; i<=9;i++){
            System.out.println();
            for (int j = 9-i; j>=1;j--){
                System.out.print(" ");
            }
            for(int k = 1;k<=9;k++){
                System.out.print("*");
            }
        }
    }
    
}
