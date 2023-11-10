/** A Programme in java to Generate a Pattern */
import java.util.Scanner;
class Pattern
{
	public static void main(String args[])
	{
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any No. : ");
		b = sc.nextInt();
		for(a=1;a<=b;a++)
		{
			System.out.println("****\n   ****");
		}
	}
}
