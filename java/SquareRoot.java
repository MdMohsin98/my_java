/*A Java Programme to find the SquareRoot*/
import java.lang.Math;
import java.util.Scanner;
class SquareRoot
{
	public static void main(String args[])
	{
		double x, y;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any No. : ");
		x = sc.nextDouble();
		y = Math.sqrt(x);
		System.out.println("Square Root of " +x+ " = " +y);
		sc.close();
	}
}