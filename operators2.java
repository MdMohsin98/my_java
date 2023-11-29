public class operators2 {
    public static void main(String[] args) {
        // Arithematic Operators
        // Binary Operators
        //      +       -       *       /       =       %

        int a = 2;
        int b = 5;
        int sum = a + b;
        int subtract = a-b;
        int multiply = a*b;
        double divide = (double)a/(double)b;
        int remainder = b%a;
        System.out.printf("Numbers: %d and %d\n", a,b);
        System.out.println("Remainder: "+ remainder);
        System.out.printf("Sum: %d, \nSubtract: %d, \nMultiply: %d, \nDivision: %f\n",sum,subtract,multiply,divide);

        // Assignment operators
        // Unary Operator ->   ++, --
        // Unary Operator increases or decrease the current value by one
        // Examples
        int c = 9;
        // c = c++;
        // Post Increment
        System.out.println("Post Increment");
        System.out.println(c++);
        System.out.println(c); // Increases the value by one

        // Pre Increment
        System.out.println("Pre Increment");
        int d = 25;
        System.out.println(++d);

        // Post Decrement
        System.out.println("Post Decrement");
        int e = 29;
        System.out.println(e--); // Decrease value by one
        System.out.println(e);

        // Pre Decrement
        System.out.println("Pre Decrement");
        int f = 99;
        System.out.println(--f);

    }
    
}
