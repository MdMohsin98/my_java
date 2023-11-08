import java.lang.reflect.Array;
import java.util.Arrays;
public class arrays {
    public static void main(String[] args) {
        // Array are the data structure that contain similar type of data.
        //Memory allocation for the array "subjects" is 3
        // i. e. We can store 3 elements in the "subjects" array
        String[] subjects = new String[3];
        subjects[0] = "Physics";
        subjects[1] = "Chemistry";
        subjects[2] = "Mathematics";
        // Similary we can create arrays of different data types.
        int[] marks = new int[3]; 
        marks[0] = 88;
        marks[1] = 98;
        marks[2] = 77;
        System.out.println(subjects[2]);
        System.out.println("The marks of " + subjects[0] + " is " + marks[0]);
        System.out.println("The marks of " + subjects[1] + " is " + marks[1]);
        System.out.println("The marks of " + subjects[2] + " is " + marks[2]);
        System.out.println("Size of subjects array: " + subjects.length); // length of the array
        System.out.println("Size of marks array: " + marks.length);
        
        // Sorting the array
        // If no value is assigned for the array then it returns false
        // for boolean data type array.
        
        boolean abcd[] = new boolean[4];
        System.out.println(abcd[3]);
    }
    
}
