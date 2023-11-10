/** A Java Programme to Calculate the Sum of Nos. between 100 to 200 
which are divisible by 7*/
import java.util.Scanner;
class Summation
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b=0;
		for(a=100;a<=200;a++)
		{
			if(a%7==0)
			System.out.println(+a);
		}
	}
}