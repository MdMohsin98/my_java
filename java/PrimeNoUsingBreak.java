/** A Java programme to evaluate the prime no. using break statement */
import java.util.Scanner;
class PrimeNoUsingBreak
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a=2, b, c, n;
		System.out.print("Enter The Value of N: ");
		n = sc.nextInt();
		System.out.println("\nThe Prime Numbers Between 1 to "+n+" are following : ");
		while(a<=n)
		{
			for(b =2; b<a;b++)
			{
				if(a%b==0)break;
			}
			if(a==b)
			{
				System.out.println("\t"+a);
			}
			a++;
		}
	}
}