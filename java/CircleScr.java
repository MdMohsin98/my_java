/* A Java Programme to Calculate the Area and Circumference of a Circle
using Scanner Class*/
import java.util.Scanner;
class CircleScr
{
	public static void main(String args[])
	{
		double a, c, r;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Radius of Circle: ");
		r = sc.nextDouble();
		a = 3.14*r*r;
		c = 2*3.14*r;
		System.out.println("Area = "+a+" and Circumference = "+c);
	}
}