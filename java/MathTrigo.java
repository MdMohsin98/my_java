/*A Java Programme to find the Mathematical */
import java.lang.Math;
import java.util.Scanner;
class MathTrigo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double a, b, c, d;
		System.out.print("Enter Angle(in Radian) : ");
		a = sc.nextDouble();
		b = Math.sin(a);
		c = Math.cos(a);
		d = Math.tan(a);
		System.out.println("Sine of " +a+ " = " +b);
		System.out.println("Cos of " +a+ " = " +b);
		System.out.println("Tan of " +a+ " = " +d);
	}
}