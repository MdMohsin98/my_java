import java.util.Scanner;

public class if_else_if {
    public static void main(String[] args) {
        // if else
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        
        int  unit = sc.nextInt();

        if(unit<=100){
            int charge = unit*2;
            System.out.println("Charge: "+charge);
        }
        else if(unit>100 && unit <=200){
            double charge1 = 100*2;
            double charge2 = (unit-100)*1.8;
            double total_charge = charge1+charge2;
            System.out.println("Total Charge: "+total_charge);
        }
        else if(unit>200){
            double charge3 = 100*2;
            double charge4 = 100*1.80;
            double charge5 = (unit-200)*1.50;
            double total_charge1 = charge3+charge4+charge5;
            System.out.println("Total Charge: "+total_charge1);
        }


        
        
    }
    
}
