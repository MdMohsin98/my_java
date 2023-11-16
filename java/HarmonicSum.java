/* A Java Programme to Generate The Harmonic Series and Calculate Sum */
import java.util.Scanner;
class HarmonicSum
{
	public static void main(String args[])
	{
		double a,b=0,n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Last No. of Series: ");
		n = sc.nextDouble();
		sc.close();
		System.out.println("\t The Harmonic Series is Following: ");
		for(a=1;a<=n;a++)
		{
			b = (1/a);
			System.out.println("\t\t"+b);
		}
	}
}