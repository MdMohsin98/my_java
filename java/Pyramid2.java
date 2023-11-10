/** A Programme in Java to Make a Pyramid */
import java.util.Scanner;
class Pyramid2
{
	public static void main(String args[])
	{
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Value of A : ");
		a = sc.nextInt();
		for(b = a; b>=1; b--)
		{
			for(c = b; c>=1; c--)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}