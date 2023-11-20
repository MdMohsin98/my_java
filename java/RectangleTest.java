/** A Java Programme to Calculate Rectangle */
import java.util.Scanner;
class Rectangle
{
	double l, b, ar, pr;
	Scanner sc = new Scanner(System.in);
	public void dimension_input()
	{
		System.out.print("Enter Length and Width of Rectangle : ");
		this.l = sc.nextDouble();
		this.b = sc.nextDouble();
		sc.close();
	}
	public void disp()
	{
		System.out.println("Length = "+this.l);
		System.out.println("Width = "+this.b);
	}
	public void area()
	{
		this.ar = this.l*this.b;
		System.out.println("Area = "+this.ar);
	}
	public void perimeter()
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