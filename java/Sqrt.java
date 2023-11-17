/** A Java Programme to calculate the Square Root of Any No. from 0.0 to 9.9 */
import java.util.Scanner;
import java.lang.Math;
class Sqrt
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double a, b;
		System.out.print("Enter Any Number : ");
		a = sc.nextDouble();
		if(a<=9.9)
		{
			b = Math.sqrt(a);
			System.out.println("The Square Root : " +b);
		}
		else
		System.out.println("\n\t Invalid Input");
		sc.close();
	}
}