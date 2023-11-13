
// Abstraction in Java

abstract class Animal{
    abstract void food();
    Animal(){
        System.out.println("Created a new Animal class.");
    }
    public void walks(){
        System.out.println("Animal walks.");
    }
}
class Lion extends Animal{
    Lion(){
        System.out.println("Created a class of Lion");
    }
    public void food(){
        System.out.println("Carnivores");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Created a class of Horse.");
    }
    public void food(){
        System.out.println("Herbivores");
    }
}
class Bears extends Animal{
    Bears(){
        System.out.println("Created a class of Bears.");
    }
    public void food(){
        System.out.println("Omnivores");
    }
}

public class abstraction {
    public static void main(String[] args) {
        // The process of abstraction
        // An abstract class must be declared with an abstract keyword.
        // It can have abstract and non-abstract methods.
        // It can not be instantiated.
        // It can have constructors and static methods also.
        // It can have final methods which will force the subclass to change
        // the body of the method.


        // When we create a constructor in base class and again we 
        // create a constructor on sub-class then firstly base class
        // constructor is called then after sub-class constructor is called.


        Bears b1 = new Bears();
        b1.food();
        // Lion l1 = new Lion();
        // l1.food();
        // Horse h1 = new Horse();
        // h1.food();

        b1.walks(); // Since walking property is inherited by Animals class
    }
}
