package pattern_questions;

public class hollow_rectangle {
    public static void main(String[] args) {
        // Hollow rectangle

        for (int i = 1;i<=10;i++){
            System.out.println();
            for(int j = 1;j<=10;j++){
                if (i==1 || j==1 || i==10 || j==10) {
                    System.out.print("* ");                    
                }
                else{
                    System.out.print("  ");
                }
            }
        }
    }
}