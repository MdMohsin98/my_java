/* A Java Programme to check the supplied no. is odd or even */
import java.util.Scanner;
class EvenOdd
{
	public static void main(String args[])
	{
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any No. ");
		a = sc.nextInt();
		if(a%2==0)
		System.out.println("Even");
		else
		System.out.println("Odd");
	}
}