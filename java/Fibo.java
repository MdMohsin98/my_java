/* A Java Programme to Generate the Fibonacci Series */
import java.util.Scanner;
class Fibo
{
	public static void main(String args[])
	{
		int a, b, c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Limit of Series ");
		b = sc.nextInt();
		sc.close();
		for(a = 0; a<=b; a++)
		{
			c = a+b;
		}
		System.out.println("The Fibonacci Series is = "+c);
	}
}