import java.util.Scanner;

public class practice1 {
    public static String perfect_num(int a){
        int sum = 0;
        for(int i = 1; i<a; i++){
            if(a%i==0){
                sum += i;
            }
        }
        String result = (sum==a)?"Perfect Number":"Not Perfect Number";
        return result;

    }
    public static void main(String[] args) {
        // Perfect Number

        Scanner sc = new Scanner(System.in);
        
        for (int i=1; i<=9000; i++){
            if (perfect_num(i) == "Perfect Number") {
                System.out.println(i + " = "+ perfect_num(i));
            }
        }
        sc.close();
    }
    
}
