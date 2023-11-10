/** A Java Programme to Check Whether the Supplied Year is a Leap Year or Not */
import java.util.Scanner;
class LeapYear
{
	public static void main(String args[])
	{
		int a;
		String b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Year : ");
		a = sc.nextInt();
		b = ((a%4==0 && a%100!=0)||(a%400==0))?" Leap Year " : " Not a Leap Year";
		System.out.println("The Year is :" +b);
	}
}