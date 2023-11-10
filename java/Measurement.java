/** A Java Programme to Convert Acres into Hectares and Hectares into Acres */
import java.util.Scanner;
class Measurement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double a, h, b, c;
		System.out.print("Acre :");
		a = sc.nextInt();
		h = 0.404686*a;
		System.out.println(+a+" Acre = "+h+" Hectare");
		System.out.print("Hectare :");
		b = sc.nextInt();
		c = 2.471054*b;
		System.out.println(+a+" Hectare = "+c+" Acre");
	}
}
		