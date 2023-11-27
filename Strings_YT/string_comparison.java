package Strings_YT;

public class string_comparison {
    public static void main(String[] args) {
        // Comparing Two Strings

        // In case of
        // 1    s1>s2 : +ve
        // 2    s1==s2 : 0
        // 3    s1<s2 : -ve 


        // As the letters of the English Alphabet increases the 
        // value of those characters increases.

        String name1 = "Mohammad", name2 = "Mohammad";

        if (name1.compareTo(name2)==0){
            System.out.println("Equal Strings.");
        }
        else{
            System.out.println("Not Equal strings.");
        }
    }
    
}
