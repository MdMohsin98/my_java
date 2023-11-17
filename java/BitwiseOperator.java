/** A Java Programme to Define the Formulae of Bitwise Operator */
import java.util.Scanner;
class BitwiseOperator
{
	public static void main(String args[])
	{
		int a, b, c, d, e, f, g;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Two No. : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a&b;
		d = a|b;
		e = a^b;
		f = ~a;
		g = ~b;
		System.out.println("After Using Bitwise Operator: ");
		System.out.println("Bitwise AND : " +c);
		System.out.println("Bitwise OR : "+d);
		System.out.println("Bitwise XOR : "+e);
		System.out.println("Bitwise 1's Complement of "+a+" : "+f);
		System.out.println("Bitwise 1's Complement of "+b+" : "+g);
		System.out.println("Binary of "+a+" is = " +Integer.toBinaryString(a));
		System.out.println("Binary of "+b+" is = " +Integer.toBinaryString(b));
		System.out.println("Octal of "+a+" is = " +Integer.toOctalString(a));
		System.out.println("Octal of "+b+" is = " +Integer.toOctalString(b));
		System.out.println("Hexadecimal of "+a+" is = " +Integer.toHexString(a));
		System.out.println("Hexadecimal of "+b+" is = " +Integer.toHexString(b));
		sc.close();
	}
}