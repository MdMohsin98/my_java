package recursion;

public class factorial_recursion {
    public static void recursion(int i, int n, int fact){
        if (i==n) {
            fact = fact *i;
            System.out.println("Factorial: "+fact);
            return;
        }
        fact = fact*i;
        recursion(i+1, n, fact);
    }

    // Another method
    
    public static int factorial(int num){
        if (num==1 || num == 0) {
            return 1;            
        }
        int num1 = factorial(num-1);
        int fact = num*num1;
        return fact;

    }
    public static void main(String[] args) {
        // Recursion using Factorial

        recursion(1, 5, 1);

        // Another method 
        System.out.println(factorial(5));


    }
    
}
