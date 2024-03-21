import java.util.Scanner;

public class perfect_palindrome {
    public static boolean palindrome(int a){
        int b = a;

        String palindrome = "";
        do {
            int c = b%10;
            palindrome += c;
            b = b/10;
        } while (b>0);

        int d = Integer.parseInt(palindrome);

        boolean result = (a==d)?true:false;
        return result;

    }

    public static boolean perfect(int z){

        int sum = 0;
        for (int i = 1; i<=(z/2); i++){
            if(z%i==0){
                sum += i;
            }
        }
        boolean result = (z==sum)? true: false;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        System.out.println("Is Palindrome? : "+ palindrome(a));

        System.out.print("Enter a number: ");
        int z = sc.nextInt();

        System.out.println("Is Perfect? : "+ perfect(z));
        
        

        sc.close();
    }
}