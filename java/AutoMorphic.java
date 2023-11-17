/* Automorphic No. */
import java.util.Scanner;
class AutoMorphic
{
	public static void main(String args[])
	{
		int n, x,s,p,c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		n = sc.nextInt();
		x = n;
		s = n*n;
		while(n>0)
		{
			n = n/10;
			c++;
		}
		n=x;
		p = s%(int)Math.pow(10,c);
		if(n==p)
		System.out.println("Automorphic Number");
		else
		System.out.println("Not An Automorphic Number");
		sc.close();
	}
}