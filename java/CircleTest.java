/** A Java Programme to Calculate Area and Circumference of Circle */
import java.util.Scanner;
class Circle
{
	double r;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius : ");
		r = sc.nextDouble();
	}
	void disp()
	{
		System.out.println("\nRadius = "+r);
	}
	void area()
	{
		double ar = 3.14*r*r;
		System.out.println("Area = "+ar);
	}
	void circum()
	{
		double cr = 2*3.14*r;
		System.out.println("Circumference = "+cr);
	}
}
public class CircleTest
{
	public static void main(String args[])
	{
		Circle c1 = new Circle();
		c1.input();
		c1.disp();
		c1.area();
		c1.circum();
	}
}