/** A Java Programme to define the example of Shift Operator */
import java.util.Scanner;
class ShiftOperator
{
	public static void main(String args[])
	{
		int a, b, c, d, e;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two Nos. ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a<<b;
		d = a>>b;
		e = a>>>b;
		System.out.println("After Using : ");
		System.out.println("	Left Shift Operator :	"+c);
		System.out.println("	Right Shift Operator :	"+d);
		System.out.println("	Unsigned Right Shift Operator :	"+e);
	
		sc.close();
	}
}