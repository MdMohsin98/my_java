/** A Programme in java to Generate a Series */
import java.util.Scanner;
class Series3
{
	public static void main(String args[])
	{
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any No. : ");
		b = sc.nextInt();
		for(a=1;a<=b;a++)
		{
			for(c=1;c<=a;c++)
			{System.out.println(+c);}
		}
	}
}
