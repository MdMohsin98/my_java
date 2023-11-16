/* A Java Programme to Calculate the Harmonic Series */
import java.util.Scanner;
class Harmonic
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double a,n;
		System.out.print("Enter The Value of n :");
		n = sc.nextDouble();
		sc.close();
		for(a=1;a<=n; a++);
		{System.out.println("1/"+a);}
	}
}