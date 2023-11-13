public class ques4 {
    public static void main(String[] args) {
        // Write a program to find the sum of all 3-digit odd natural numbers, 
        // which are multiples of 5.

        int i, sum=0;
        for (i=105;i<1000;i = i+10){
            // System.out.println(i);
            sum = sum+i;
        }
        System.out.println(sum);
    }
    
}
