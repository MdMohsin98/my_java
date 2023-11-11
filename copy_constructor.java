class student_1{
    String name;
    int roll;

    public void introduction(){
        System.out.println("Name: " + this.name);
        System.out.println("Roll: " + this.roll);
    }
    student_1(student_1 s2){
        this.name = s2.name;
        this.roll = s2.roll;
    }
    student_1(){}
}
public class copy_constructor {
    public static void main(String[] args) {
        // Copy Constructor

        student_1 s1 = new student_1();
        s1.name = "Mohsin";
        s1.roll = 11;
        // s1.introduction();
        student_1 s2 = new student_1(s1);
        s2.introduction();
    }
    
}
