/** A Java Programme to Reverse the digits of Any Number */
import java.util.Scanner;
class ReverseNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;
		System.out.print("Enter Any Number: " );
		a = sc.nextInt();
		if(a<=99)
		{

			b = a%10;
			c = a/10;
			System.out.println("Reverse of The No. is "+b+c);
		}
		if(a<=999)
		{
			b = a%10;
			c = a%100;
			d=a/100;
			System.out.println("Reverse of The No. is "+b+c+d);
		}
		sc.close();
	}
}