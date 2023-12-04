package recursion;

public class fibonacci_recursion {
    public static void fibonacci(int i, int j, int n){
        if (n==0) {
            return;            
        }
        int fibo = i+j;
        System.out.print(fibo + " ");
        fibonacci(j, fibo, n-1);

    }
    public static void main(String[] args) {
        // Generate fibonacci series using Recursion

        fibonacci(0,1,5);
    }
    
}
