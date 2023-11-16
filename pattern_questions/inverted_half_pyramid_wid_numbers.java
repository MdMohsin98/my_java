package pattern_questions;

public class inverted_half_pyramid_wid_numbers {
    public static void main(String[] args) {
        // Inverted half pyramid with numbers

        for (int i = 9; i>=1;i--){
            System.out.println();
            for(int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
        }
    }
    
}
