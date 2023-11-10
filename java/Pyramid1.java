/** A Java programme to print a table */
import java.util.Scanner;
class Pyramid1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n, i, j;
		System.out.print("N = ");
		n = sc.nextInt();
		for(i = 1; i<=n;i++)
		{
			for(j = 1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}