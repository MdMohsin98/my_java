/** A Java Programme to Calculate the value of sin a */
import java.lang.Math;
import java.util.Scanner;
class Trigonometry
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		System.out.print("Enter Angle: ");
		a = sc.nextDouble();
		b = Math.sin(a);
		c = Math.cos(a);
		System.out.println("Sine("+a+") = "+b);
		System.out.println("Cos("+a+") = "+c);
		sc.close();
	}
}