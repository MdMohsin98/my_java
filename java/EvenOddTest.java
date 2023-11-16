/* A Java Programme to Check Whether the Supplied No. is
odd or even */
import java.util.Scanner;
class EvenOddTest
{
	public static void main(String args[])
	{
		int  n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Number : ");
		n = sc.nextInt();
		if(n%2==0)
		System.out.println("\n\tEven ");
		else
		System.out.println("\n\tOdd ");
		sc.close();
	}
}