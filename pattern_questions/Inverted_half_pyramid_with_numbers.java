package pattern_questions;

public class Inverted_half_pyramid_with_numbers {
    public static void main(String[] args) {
        // Inverted Half Pyramid with numbers

        int row = 7;
        for (int i = row;i>=1;i--){
            System.out.println();
            for(int j = 1;j<=i;j++){
                System.out.print((row+1)-i+" ");
            }
        }
    }
    
}
