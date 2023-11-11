class studentInfo{
    String name;
    String course;
    int roll;
    public void info(){
        System.out.println("Name: " + this.name);
        System.out.println("Course: " + this.course);
        System.out.println("Roll: " + this.roll); 
    }
    studentInfo(String name, String course, int roll){
        this.name = name;
        this.course = course;
        this.roll = roll;
    }
}

public class parameterized_constructor {
    public static void main(String[] args) {
        // Parameterized Constructor
        studentInfo s1 = new studentInfo("Mohsin", "BCA", 11);
        s1.info();
    }
    
}
