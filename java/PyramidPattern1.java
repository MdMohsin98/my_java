/** A Java Programme to Make a specific pattern */
import java.util.Scanner;
class PyramidPattern1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i, j, k, n;
		System.out.print("N = ");
		n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j = n;j>=i;j--)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}