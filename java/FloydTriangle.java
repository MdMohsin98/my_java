/** A Java Programme to Make Floyd's Triangle */
import java.util.Scanner;
class FloydTriangle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.print("Any No. : ");
		a = sc.nextInt();
		for(b = 1;b<=a;b++)
		{
			for(c = 1;c<=b;c++)
			{
				System.out.print(b+" ");
			}
		System.out.println();
		}
	}
}