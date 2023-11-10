/** A Java Programme to Calculate 2's Complement of Given No. */
import java.util.Scanner;
class BinaryConversion
{
	public static void main(String args[])
	{
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any No. : ");
		a = sc.nextInt();
		b = ~a; //1's Complement of a
		c = b + 1 ;// 2's Complement of a
		System.out.println("Number = "+a);
		System.out.println("1's Complement of "+a+" = "+b);
		System.out.println("2's Complement of "+a+" = "+c);
		System.out.println("Binary of "+a+" is  = "+Integer.toBinaryString(a));
		System.out.println("Binary of 1's Complement of "+a+" is  = "+Integer.toBinaryString(b));
		System.out.println("Binary of 2's Complement of "+a+" = "+Integer.toBinaryString(c));
	}
}