public class operators {
    public static void main(String[] args) {
        // Arithematic Operators
        int a = 2;
        int b = 5;
        int sum = a + b;
        int subtract = a-b;
        int multiply = a*b;
        double divide = (double)a/(double)b;
        int remainder = b%a;
        System.out.println("Remainder: "+ remainder);
        System.out.println("Sum: "+sum+", Subtract: "+subtract+", Multiply: "+multiply+", Division: "+divide);

        // Assignment operators
        // Unary Operator ->   ++, --
        // Unary Operator increases or decrease the current value by one
        // Examples
        int c = 9;
        // c = c++;
        System.out.println(c++);
        System.out.println(c); // Increases the value by one

        int d = 25;
        System.out.println(++d);

        int e = 29;
        System.out.println(e--); // Decrease value by one
        System.out.println(e);

        int f = 99;
        System.out.println(--f);

    }
    
}
