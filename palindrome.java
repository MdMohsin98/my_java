public class palindrome {
    public static boolean checkPalindrome(int num){
        int original_num = num;
        String reversed_num = "";
        while (num>0) {
            int digit = num%10;
            reversed_num = reversed_num+digit;
            num = num/10;
        }
        boolean result = (Integer.parseInt(reversed_num) == original_num)? true:false;
        return result;
    }
    public static void main(String[] args) {
        // Write a function to identify the given
        // number is palindrome or not

        System.out.println(checkPalindrome(121));

    }
    
}
