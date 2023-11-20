package pattern_questions;

public class half_pyramid_numbers {
    public static void main(String[] args) {
        // Half pyramid by numbers
        int rows = 7;
        for(int i = 1; i<=rows;i++){
            System.out.println();
            for(int j = rows-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k = 1; k<=i;k++){
                System.out.print(k+" ");
            }
        }
    }
    
}
