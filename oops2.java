class bottle{
    String color;
    String size;
    double volume;
    public void features(){
        System.out.println(this.color);
        System.out.println(this.size);
        System.out.println(this.volume);
    }
}
class student_details{
    String sname;
    String sclass;
    public void details(){
        System.out.println(this.sname);
        System.out.println(this.sclass);
    }
}
public class oops2 {

    public static void main(String[] args) {
        // oops 2nd example
        bottle b1 = new bottle();
        b1.color = "black";
        b1.size = "Medium";
        b1.volume = 1000;

        b1.features();

        student_details s1 = new student_details();
        s1.sname = "Mohammad Mohsin";
        s1.sclass = "BCA";
        s1.details();
    }
}