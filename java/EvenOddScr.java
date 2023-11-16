/* A Java Programme to take input by Scanner Class */
import java.util.Scanner;
class EvenOddScr
{
	public static void main(String args[])
	{
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a No. ");
		a = sc.nextInt();
		if(a%2==0)
		System.out.println("The No. is Even ");
		else
		System.out.println("The No. is Odd ");
		sc.close();
	}
}