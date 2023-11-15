package conditional_questions;

class Cube_Square{
    
    public void square_cube(int num){
        if (num>120) {
            int sq = num*num;
            System.out.println("Square of " +num+" = " + sq);            
        }
        else{
            int cub = num*num*num;
            System.out.println("Cube of " +num+" = " + cub);
        }
    }
}

public class ques5 {
    public static void main(String[] args) {
        // Write a program to accept an int type value as a parameter and 
        // print the square of it, if it is more than 120, otherwise print its cube.
    

        Cube_Square cs = new Cube_Square();
        cs.square_cube(150);

    }
    
}
