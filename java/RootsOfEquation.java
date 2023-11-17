/** A Java Programme to print the roots of Equation */
import java.lang.Math;
import java.util.Scanner;
class RootsOfEquation
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double x, y, a, b, c;
		System.out.print("Input the values of 'a' , 'b' and 'c' :");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		System.out.println("Now the Equation is : "+a+"x*x + "+b+" + "+c);
		x = (-(b) + Math.sqrt(b*b-4*a*c))/2*a;
		y = (-(b) - Math.sqrt(b*b-4*a*c))/2*a;
		System.out.println("The Roots Are : "+x+" and "+y);
		sc.close();
	}
}