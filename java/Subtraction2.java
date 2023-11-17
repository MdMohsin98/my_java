/* A Java Programme to Subtract any two Nos. */
import java.util.Scanner;
class Subtraction2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter Any Two Nos. ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a-b;
		System.out.println(a+" - "+b+" = "+c );
		sc.close();
	}
}
		
		