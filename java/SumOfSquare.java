/** A Java Programme to read two nos. and print their sum of Square */
import java.util.Scanner;
class SumOfSquare
{
	public static void main(String args[])
	{
		int a, b, c, d, e;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Two Nos. :");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a*a;
		d = b*b;
		e = c + d;
		System.out.println( +a+ " * "+a+" = " +c+ " \n " +b+ " * " +b+ " = " +d+"\n Sum of Square = " +e);
		sc.close();
	}
}