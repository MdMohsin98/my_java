// Interfaces in Java

// constructors can't be made inside interface classes

interface Animal1{
    int eyes = 2;
    public void walk();
}
interface Herbivores{

}

class Horse1 implements Animal1, Herbivores{
    public void walk() {
        System.out.println("Walks on 4 legs.");
    }

}

public class interfaces {
    public static void main(String[] args) {
        // Interfaces in Java

        Horse1 h1 = new Horse1();
        h1.walk();

    }
    
}
