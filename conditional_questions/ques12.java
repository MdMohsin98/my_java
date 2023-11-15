package conditional_questions;

class Triangle{
    public void checkTriangle(int s1, int s2, int s3){
        if (s1<(s2+s3) || s2<(s1+s3) || s3<(s1+s2)) {
            System.out.println("It can form a triangle.");
            if ((s1*s1)<((s2*s2)+(s3*s3)) && (s2*s2)<((s1*s1)+(s3*s3)) && (s3*s3)<((s1*s1)+(s2*s2))) {
                System.out.println("Acute Angled Triangle");
            }
            else if ((s1*s1)>((s2*s2)+(s3*s3)) || (s2*s2)>((s1*s1)+(s3*s3)) || (s3*s3)>((s1*s1)+(s2*s2))) {
                System.out.println("Obtuse Angeled Triangle");
            }
            else if ((s1*s1)==((s2*s2)+(s3*s3)) || (s2*s2)==((s1*s1)+(s3*s3)) || (s3*s3)==((s1*s1)+(s2*s2))) {
                System.out.println("Right Angled Triangle");
            }
            else{
                System.out.println("Some other type of triangle.");
            }
        }
        else{
            System.out.println("It can't form a triangle.");
        }

    }
}
public class ques12 {
    public static void main(String[] args) {
        // Write a program to accept three sides of a triangle as parameter 
        // and check whether it can form a triangle or not. If it forms a 
        // triangle, check whether it is an acute angled, obtuse angled or 
        // right-angled triangle.

        Triangle tr = new Triangle();
        tr.checkTriangle(8, 13, 15);

    }
    
}
