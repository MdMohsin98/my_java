package Exercise_1;

public class ques10_fibonacci {
    public static void fibonacci(int n){
        int a=0,b=1,fibo=0; 
        for (int i = 1;i<=n;i++){
            fibo = a+b;
            a = b;
            b = fibo;
            System.out.print(fibo+" ");
        }
    }
    public static void main(String[] args) {
        // Write a program to print Fibonacci series of n terms 
        // where n is input by user : 0 1 1 2 3 5 8 13 21 .....
        // In the Fibonacci series, a number is the sum of the previous 
        // 2 numbers that came before it.

        fibonacci(10);
    }  
}
