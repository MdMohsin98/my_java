package conditional_questions;

class Numbers1{
    public void num_functions(int num1, int num2){
        if (num1==0 || num2 ==0) {
            System.out.println("Invalid Entry");
        }
        else{
            double division = Math.max(num1,num2)/Math.min(num1,num2);
            System.out.println("Result: " + division);
        }

    }
}

public class ques11 {
    public static void main(String[] args) {
        // Write a program to pass 2 integer numbers as parameters. 
        // If either of the two numbers is 0, display invalid entry and the 
        // program should end, if it is valid entry, divide the larger number 
        // with the smaller number and display the result.

        Numbers1 n1 = new Numbers1();
        n1.num_functions(44, 88);
    }
    
}
