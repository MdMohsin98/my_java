import java.util.Scanner;

class mobile{
    String brand;
    String os;
    String type;
    public void calling() {
        System.out.println("This phone is used for calling.");

    }
    public void features(){
        System.out.println("Brand: " +this.brand);
        System.out.println("OS: " + this.os);
        System.out.println("Phone Type: " + this.type);
        System.out.println("======================");

    }
}
class Student_info{
    String student_name;
    String study_class;
    int roll;
    String college;
    public void printName(){
        System.out.println("Name: " +this.student_name);
    }
    public void study_class_level(){
        System.out.println("Class: " + this.study_class);
    }
    Student_info(){
        System.out.println("Student Introduction.");
    }
}

public class oops {
    public static void main(String[] args) {
        mobile mb = new mobile();
        Scanner sc = new Scanner(System.in);
        System.out.print("Brand: ");
        mb.brand = (String)sc.nextLine();
        System.out.print("Os: ");
        mb.os = (String)sc.nextLine();
        System.out.print("Type: ");
        mb.type = (String)sc.nextLine();
        // mb.calling();   
        // mb.features();
        
        mobile mb2 = new mobile();
        mb2.brand = "OnePlus";
        mb2.os = "Android";
        mb2.type = "Screen Touch";
        // mb2.calling();
        mb2.features();
        mb.features();

        Student_info s1 = new Student_info();
        s1.student_name = "Rohan";
        s1.roll = 11;
        s1.college = "TMBU";
        s1.study_class = "BCA";
        s1.printName();
    }
    
}
