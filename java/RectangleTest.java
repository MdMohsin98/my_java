/** A Java Programme to Calculate Rectangle */
import java.util.Scanner;
class Rectangle
{
	double l, b, ar, pr;
	void dimension_input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length and Width of Rectangle : ");
		double l = sc.nextDouble();
		double b = sc.nextDouble();
	}
	void disp()
	{
		System.out.println("Length = "+this.l);
		System.out.println("Width = "+this.b);
	}
	void area()
	{
		// double ar, l, b;
		ar = l*b;
		System.out.println("Area = "+ar);
	}
	void perimeter()
	{
		double pr = 2*(l+b);
		System.out.println("Perimeter = "+pr);
	}
}
public class RectangleTest
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle();
		r.dimension_input();
		r.disp();
		r.area();
		r.perimeter();
	}
}