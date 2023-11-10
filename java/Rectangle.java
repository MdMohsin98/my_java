/* A Java Programme to find the Area and Perimeter of a Rectangle */
import java.util.Scanner;
class Rectangle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, p, l, b;
		System.out.println("Enter The Length and Breadth of Rectangle");
		l = sc.nextInt();
		b = sc.nextInt();
		a = l*b;
		p = 2*(l+b);
		System.out.println("Area = "+a+" and Perimeter = "+p);
	}
}