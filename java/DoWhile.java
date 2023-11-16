/** A Java Programme to define the example of While and DoWhile Loop */
import java.util.Scanner;
class DoWhile
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a=0, b;
		/**System.out.print("Enter The Value of A: ");
		a = sc.nextInt();*/
		do
		{
			for(b = 2; b<=a/2; b++)
			{
				if(a%b==0)
				System.out.println(a);
				a++;
			}
		}while(a<=5);
		sc.close();
	}
}