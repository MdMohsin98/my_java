/** A Java Programme is to generate Fibonacci Series */
import java.util.Scanner;
class Fibo1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a=0, b=1, c=0, n;
		System.out.print("Enter Last No. of Fibonacci Series ");
		n = sc.nextInt();
		System.out.println("The Fibonacci Series is : ");
		while(c<=n)
		{
			System.out.println("\t " +c);
			a = b;
			b = c;
			c = a+b;
		}
	}
}