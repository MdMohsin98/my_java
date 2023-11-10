/** A Programme to make a pyramid */
import java.util.Scanner;
class Pyramid6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.print("Enter The Value of A : ");
		a = sc.nextInt();
		for(b = a; b>=1; b--)
		{
			for(c = a; c>=b; c--)
			{
				System.out.print(c+ " ");
			}
			System.out.println();
		}
	}
}