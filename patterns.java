public class patterns {
    public static void main(String[] args) {
        // Create a pyramid patter

        int row = 5;
        for(int i = 1; i<=row; i++){
            System.out.println();
            for(int j = row-i; j>=0;j--){
                System.out.print(" ");
            }
            for (int k = 1; k<=i; k++){
                System.out.print("* ");
            }
        }
    }
    
}
