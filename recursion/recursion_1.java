package recursion;

public class recursion_1 {

    public static void recursive(int num){
        if (num==0) {
            return;
        }
        System.out.println(num);
        recursive(num-1);
    }
    public static void main(String[] args) {
        // Print numbers from 5 to 1;

        recursive(5);
    }
    
}
