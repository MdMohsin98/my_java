class student_2{
    String name;
    int roll;
    public void printInfo(String name){
        System.out.println("Name: " + name);
    }
    public void printInfo(int roll){
        System.out.println("Roll: " + roll);
    }
    public void printInfo(String name, int roll){
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }
}


public class polymorphism {
    public static void main(String[] args) {
        // Polymorphism
        // Poly = Many
        // Morphism = Forms
        // The many forms of a single work

        // In java when we use a single function multiple times
        // for multiple purpose then this is called Polymorphism
        student_2 s1 = new student_2();
        s1.name = "Mohsin";
        s1.roll = 11;
        s1.printInfo(s1.name, s1.roll);
    }
    
}
