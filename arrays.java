import java.util.Arrays;
import java.util.Collections;
public class arrays {
    public static void main(String[] args) {
        // Array are the data structure that contain similar type of data.
        //Memory allocation for the array "subjects" is 3
        // i. e. We can store 3 elements in the "subjects" array
        String[] subjects = new String[3];
        subjects[0] = "Physics";
        subjects[1] = "Chemistry";
        subjects[2] = "Mathematics";
        // New way to define an array
        int[] marks = {88, 98, 77}; 
        System.out.println(subjects[2]);
        System.out.println("The marks of " + subjects[0] + " is " + marks[0]);
        System.out.println("The marks of " + subjects[1] + " is " + marks[1]);
        System.out.println("The marks of " + subjects[2] + " is " + marks[2]);
        System.out.println("Size of subjects array: " + subjects.length); // length of the array
        System.out.println("Size of marks array: " + marks.length);
        
        // Sorting the array

        Arrays.sort(marks); // In ascending order
        Arrays.sort(subjects, Collections.reverseOrder()); // In descending order
        System.out.println(subjects[0] + " " + subjects[1] + " " + subjects[2]);
        System.out.println(marks[0] + " " + marks[1] + " " + marks[2]);
        // If no value is assigned for the array then it returns false
        // for boolean data type array.
        
        boolean abcd[] = new boolean[4];
        System.out.println(abcd[3]);


        // A new way to define array

        String subject2[] = {"abc", "def", "ghi"};
        System.out.println(subject2[0]);

        // 2-D Arrays

        int[][] finalMarks = {{88, 89, 90},{81, 82, 83}};
        System.out.println("Marks: " + finalMarks[1][1]);
    }
    
}