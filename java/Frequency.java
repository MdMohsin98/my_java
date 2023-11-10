/** A Java Programme to calculate the frequency */
import java.lang.Math;
import java.util.Scanner;
class Frequency
{
	public static void main(String args[])
	{
		double l, c, r, f, g, h;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Inductance 'L' :");
		l = sc.nextInt();
		System.out.print("Enter Resistance 'R': ");
		r = sc.nextInt();
		for(c = 0.01; c<=0.10; c++)
		{
			f = ((1/l*c)-((r*r)/(4*c*c)));
			g = Math.sqrt(f);
			System.out.println("Frequencies between 0.01 and 0.10 is following : " +g);
		}
	}
}