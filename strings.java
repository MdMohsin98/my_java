// import java.net.SocketTimeoutException;

public class strings {
    public static void main(String[] args) {
        // Strings
        String name1 = "Mohammad";
        String lname = "Mohsin";
        String fname = name1 + ' '+ lname;
        System.out.println(fname);
        System.out.println(fname.charAt(2));
        System.out.println(fname.length());
        System.out.println(fname.contains("s"));
        System.out.println(fname.substring(2, 6));
        System.out.println(fname.replace("Mohsin", "Ansari"));
        System.out.println(fname.substring(0, 8));
    }
}
