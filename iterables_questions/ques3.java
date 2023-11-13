public class ques3 {
    public static void main(String[] args) {
        // Write a program to find the sum of all 3-digit even natural numbers.
        int i, sum=0;
        for(i=100;i<1000;i=i+2){
            // System.out.println(i);
            sum = sum+i;
        }
        System.out.println(sum);
    }
    
}
