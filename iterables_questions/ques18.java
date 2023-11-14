public class ques18 {
    public static void main(String[] args) {
        // Write a program to find the sum of 1st 10 numbers of Fibonacci 
        // series i.e.
        // 1,1,2,3,5,8,13….Fibonacci series is such a series which 
        // starting from 1 and 1, and subsequent numbers are the sum of 
        // the previous two numbers.

        int num1 = 0, num2 = 1, fibo=0, sum = 0;
        for(int i=1;i<=10;i++){
            fibo = num1+num2;
            num1 = num2;
            num2 = fibo;
            sum = sum+fibo;
            System.out.print(fibo+" ");
        }
        System.out.println();
        System.out.println("Total Sum of Fibonacci numbers: " + sum);
    }
    
}
