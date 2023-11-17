/** A Java Programme to print Odd and Even Nos. using while loop */
import java.util.Scanner;
class WhileTest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a=1, b;
		System.out.print("Enter Any No. : ");
		b = sc.nextInt();
		while(a<=b)
		{
			if(a%2==0)
			System.out.println(a+ "	-	Even");
			else
			System.out.print(a+"	-	Odd	||	");
			a++;
		}
		sc.close();

	}
}