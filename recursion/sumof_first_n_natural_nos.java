package recursion;

public class sumof_first_n_natural_nos {
    public static void sum_n(int i, int n, int sum){
        if (i==n) {
            sum = sum+i;
            System.out.println("Total sum: "+sum);
            return;
        }
        sum = sum+i;
        sum_n(i+1, n, sum);
        System.out.println(i);
    }
    public static void main(String[] args) {
        // This programme will calculate the sum of first n natural numbers
        // using recursion.

        sum_n(1, 5, 0);
    }
    
}
