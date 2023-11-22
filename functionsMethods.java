class print_my_name{
    public String print_name(String name1){
        // System.out.println("Your name is : "+name1);
        return name1;
    }
}

public class functionsMethods {
    public static void greetings(){
        System.out.println("Hello, Welcome to Java");
    }
    public static void intro(String name){
        System.out.println("Welcome, "+name);
    }
    public static void main(String[] args) {
        // Functions and Methods in Java
        greetings();
        
        print_my_name pt = new print_my_name();
        // pt.print_name("Mohammad Mohsin");
        System.out.println(pt.print_name("Mohammad Mohsin"));
        intro(pt.print_name("Mohammad Mohsin"));
    }
    
    
}
