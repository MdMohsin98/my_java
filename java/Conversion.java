/** A Programme in Java to Convert the Decimal into Binary and Binary to Decimal */
import java.util.Scanner;
class Conversion
{
	public static void main(String args[])
	{
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Decimal No. : ");
		a = sc.nextInt();
		b = a%2;
		{System.out.println(+b);}
		sc.close();
	}
}