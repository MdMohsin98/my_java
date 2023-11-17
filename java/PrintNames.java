/** A Programme in Java to print names of 10 Students using enhanced for loop */
import java.util.Scanner;
class PrintNames
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		// int x = 0;
		int[] x = {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<x.length;i++)
		{
			System.out.print(+x[i]+ " ");
		}
		sc.close();
	}
}