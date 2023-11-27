/* A Java Programme to find the Area and Circumference of a Circle */
import java.util.Scanner;
class Circle2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double a, c; 
		float r;
		System.out.println("Enter The Radius of Circle(In Centimeters)");
		r = sc.nextInt();
		a = (22/7.00)*r*r;
		c = 2*(22/7.00)*r;
		System.out.println("Area = "+a+"(Centimeter Square) Circumference = "+c+"(Centimeter)");
		sc.close();
	}
}