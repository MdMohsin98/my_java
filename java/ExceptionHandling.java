/** A Java Programme for Exception Handling */
import java.util.Scanner;
class ExceptionHandling
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b;
		double c;
		System.out.print("Enter Any Two Nos. : ");
		a = sc.nextInt();
		b = sc.nextInt();
		try
		{
			c = a/b;
			System.out.println("C = "+c);
		}
		catch(Exception e)
		{
			System.out.println("Cannot Devide By Zero ");
		}
		finally
		{
			System.out.println("Thanks ");
		}
		System.out.println("Result Code");
		sc.close();
	}
}