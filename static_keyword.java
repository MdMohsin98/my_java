class student2{
    String name;            // name may be changed 
    static String school;   // school will be same for each student because
                            // here static keyword is used
    public static void newSchool(){
        school = "newSchool";
    }
}

public class static_keyword {
    public static void main(String[] args) {
        // Why static keyword is used in Java

        // When we use static keyword that means the function or variables
        // would be same for anywhere in the program

        student2.school = "TNB";
        student2 s2 = new student2();
        s2.name = "Mohsin";
        System.out.println(student2.school);
        System.out.println(s2.name);

    }
    
}
