package pattern_questions;

public class zero_one_pyramid {
    public static void main(String[] args) {
        // Zero One Pyramid

        for (int i = 1; i<=9;i++){
            System.out.println();
            for (int j = 1; j<=i; j++){
                if ((i+j)%2==1) {
                    System.out.print(0+" ");
                }
                else if ((i+j)%2==0) {
                    System.out.print(1+" ");
                }
            }
        }
    }
    
}
