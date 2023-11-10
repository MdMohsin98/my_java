/*  A Java Programme to Calculate Factorial using Scanner Class */
import java.util.Scanner;
class FactorialScan
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i, f=1, n, a =1;
		System.out.print("Enter any No.: ");
		n = sc.nextInt();
		while(a<=n)
		{

			for(i=1;i<=n;i++)
			f = f*i;
			System.out.println("Factorial = " +f);	
			a++;
		}
	}
}
