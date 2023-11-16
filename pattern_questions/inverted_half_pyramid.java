package pattern_questions;

public class inverted_half_pyramid {
    public static void main(String[] args) {
        // Inverted half pyramid

        for (int i=10;i>=1;i--){
            System.out.println();
            for(int j = i; j>=1;j--){
                System.out.print("* ");
            }
        }
    }
    
}
