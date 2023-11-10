/* A Java Programme to Generate the Fibonacci Series */
import java.util.Scanner;
class Fibonacci
{
	public static void main(String args[])
	{
		int a=0, b=1, c=0,n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Last No. of Series ");
		n = sc.nextInt();
		System.out.println("Fibonacci Series is Following :");
		while(c<=n)
		{
			System.out.println("\t" +c);
			a = b;
			b = c;
			c = a+b;
		}
	}
}