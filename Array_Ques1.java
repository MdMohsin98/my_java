import java.util.Scanner;

public class Array_Ques1 {
    public static void main(String[] args) {

        // Linear Search Algorithm and other algorithms

        // Take an Array as input. Search for the given number x
        // and print the index at which it occurs.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] new_array = new int[size];
        System.out.println("Enter the elements of the Array");
        for (int i = 0;i<size;i++){
            new_array[i] = sc.nextInt();
        }
        // All the elements are entered now suppose we have find the
        // find the index of any number
        System.out.print("Enter a number from the array : ");
        int num = sc.nextInt();
        for (int i = 0; i<size; i++){
            if (new_array[i]==num){
                System.out.printf("The index of %d is %d\n",num,i);
            }
        }
        sc.close();
    }
    
}
