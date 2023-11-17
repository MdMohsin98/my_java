/** A Java Programme to find the Place Value of Any No. */
import java.util.Scanner;
class PlaceValue
{
	public static void main(String args[])
	{
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Number : ");
		a = sc.nextInt();
		if(a<=99)
		{
			b = a%10;
			c = a/10;
			System.out.println("The Place Value of One's of  "+a+" is = "+b);
			System.out.println("The Place Value of Two's of  "+a+" is = "+c);
		}
		else
		System.out.println("\n\tPlease Enter Any Two Digit Number ");
		sc.close();
	}
}