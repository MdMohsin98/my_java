/** A Programme in Java to Calculate the Area of Sphere */
import java.util.Scanner;
class AreaSphere
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		System.out.print("Enter Radius :");
		a = sc.nextInt();
		b = 4*3.14*a*a;
		System.out.println("Area : " +b);
	}
}