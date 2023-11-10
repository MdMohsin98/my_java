/** A Java Programme to calculate the Exponential Term 'e' With given power */
import java.util.Scanner;
class ExponentialTerm
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double x, y, a, b, c= 1;
		System.out.println("Enter the power of 'e' :");
		x = sc.nextInt();
		for(a = 1; a<=x; a++)
		{
			for(b = 1; b<=a; b++)
			c = c*b;
			y = 1+ (Math.pow(x, a)/c);
			System.out.println("The Value of Exponential Term "+y);
		}
	}
}