import bank.bank;

// Base Class - shape
class shape{
    String color;
    public void area(){
        System.out.println("Prints area.");
    }
}
// Single level inheritance - When one class is inherited by another
class Triangle extends shape{
    public void area(double l, double h){
        double ar = 0.50*l*h;
        System.out.println("Area: " + ar);
    }
}
// Multi level inheritance - When one class is inherited by 
// another which is already inherited from base class
class EquiLateralTriangle extends Triangle{
    public void area(double l, double h){
        System.out.println("Area: " + 0.50*l*h);
    }
}

// Hierarchial  inheritance - When more than one subclass is
// inherited by base class

class Circle extends shape{
    public void area(int r){
        System.out.println("Area: " + 3.14*r*r);
    }
}

// Hybrid inheritance - In this type of inheritance multiple types of 
// inheritances are performed in one place sometimes - Single Level, Multi Level
// and hierarchial

public class inheritance {
    public static void main(String[] args) {
        // Inheritance
        // In java when one class wants to obtain the 
        // properties of other class then this is 
        // known as Inheritance

        Triangle t1 = new Triangle();
        t1.color = "Red";
        t1.area(12, 5);

        ;
 
    }
}
