/** A Java Programme to make a pyramid pattern */
import java.util.Scanner;
class Pyramid7
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i, j, n;
		System.out.print("Enter The Value of n :");
		n = sc.nextInt();
		for(i= n;i>=1;i--)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}