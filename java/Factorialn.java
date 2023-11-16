/** A Programme in Java to Find the Factorial */
import java.util.Scanner;
class Factorialn
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b=1, n;
		System.out.print("Enter the value of n : ");
		n = sc.nextInt();
		sc.close();
		for(a=1;a<=n;a++)
		b = b*a;
		System.out.println("Factorial : " +b);
	}
}