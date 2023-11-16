/** A Java Programme to find the Maximum No. using Conditional Operator */
import java.util.Scanner;
class Maxima
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b, max;
		System.out.print("Enter Any Two Nos.: ");
		a = sc.nextInt();
		b = sc.nextInt();
		max = (a>b)?a:b;
		System.out.println("The Greater No. is : "+max);
		sc.close();
	}
}