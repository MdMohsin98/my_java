public class recursion {
    public static void printNames_five_to_one(int num){
        if (num==0){
            return;
        }
        System.out.println("Hello " + num);
        printNames_five_to_one(num-1);
    }
    public static void print_one_to_five(int num1){
        if (num1==6) {
            return;
        }
        System.out.println(num1);
        print_one_to_five(num1+1);
    }
    public static void main(String[] args) {
        // Recursion Example
        System.out.println("Five to one");
        printNames_five_to_one(5);
        System.out.println("One to five");
        print_one_to_five(1);
    }
}