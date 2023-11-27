package Strings_YT;

public class string_builder {
    public static void main(String[] args) {
        
        // Strings are immutable

        StringBuilder sb = new StringBuilder();

        sb.append("Mohsin");

        System.out.println(sb);
        
        // Character at index 0
        System.out.println(sb.charAt(0));
        
        // Set character at index  
        sb.setCharAt(0, 'N');
        System.out.println(sb);

        // Insert method

        StringBuilder sb1 = new StringBuilder("Sony");
        
        System.out.println(sb1.insert(1, "t"));

        System.out.println(sb1.insert(3, "n"));

        // Deleting

        System.out.println(sb1.delete(1,2));
        System.out.println(sb1.deleteCharAt(3));

        // Replacing and deleting
        // Suppose we have to transform "Sony" to "Toy"

        sb1.replace(0, 1, "T");
        System.out.println(sb1);
        sb1.delete(2, 3);
        System.out.println(sb1);

        // Appending

        StringBuilder sb2 = new StringBuilder("H");
        sb2.append("ello");
        System.out.println(sb2);
        System.out.println(sb2.length());
    }
    
}
