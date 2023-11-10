/** A Java Programme to Calculate Rectangle */
import java.util.Scanner;
class Rectangle
{
	double l, b, ar, pr;
	public static void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length and Width of Rectangle : ");
		int l = sc.nextInt();
		int b = sc.nextInt();
	}
	public static void disp()
	{
		System.out.println("Length = "+l);
		System.out.println("Width = "+b);
	}
	public static void area()
	{
		ar = l*b;
		System.out.println("Area = "+ar);
	}
	public static void perimeter()
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
		r.input();
		r.disp();
		r.area();
		r.perimeter();
	}
}