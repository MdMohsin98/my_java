/* A Java Programme to Calculate the Money in Paise */
import java.util.Scanner;
class Money
{
	public static void main(String args[])
	{
		double a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Money in Rs. (in 00.00 format) : ");
		a = sc.nextDouble();
		b = a*100;
		System.out.print("Money in Paise is : "+b+" paise");
		sc.close();
	}
}