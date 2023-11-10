/** Factorial */
import java.util.Scanner;
class Fact
{
	public static void main(String args[])
	{
		int a, b; 
		long c = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Number : ");
		b = sc.nextInt();
		for(a = 1; a<=b; a++)
		c = c*a;
		System.out.println("Factorial = " +c);
	}
}