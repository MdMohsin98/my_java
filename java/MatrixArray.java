/* A C Programme to input m*n matrix and to calculate their sum row wise */
import java.util.Scanner;
class MatrixArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[][],i,j,m,n,s;
		System.out.print("\n Enter order of matrix");
		m = sc.nextInt();
		n = sc.nextInt();
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.println("Enter Elements");
				a = sc.nextInt([][]);
			}
		}
		System.out.println("Elements Are ");
		for(i=0;i<m;i++)
		{
			s=0;
			for(j=0;j<n;j++)
			{
				System.out.println(a[i][j]);
				s = a[i][j];
			}
			System.out.println("\n"+s);
		}
	}
}