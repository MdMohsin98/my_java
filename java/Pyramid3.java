/** A Java Programme to Make a Pyramid */
import java.util.Scanner;
class Pyramid3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.print("Enter The Value of A : ");
		a = sc.nextInt();
		for(b = a; b>=1; b--)
		{
			for(c = 1; c<=b; c++)
			{
				System.out.print(c+ "  ");
			}
			System.out.println();
		}
	}
}