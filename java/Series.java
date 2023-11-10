/**  A Java programme to Generate a Series */
import java.util.Scanner;
class Series
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter any Last No. of Series");
		c = sc.nextInt();
		System.out.println("The Table is Following: ");
		for(a=1;a<=c;a++)
		{
			for(b=1;b<=a;b++)
			{
				System.out.print(" ");
				System.out.print(a);
			}
			System.out.println("\n ");
		}
			
	}
		
}