/* A Java Programme to Generate the Table */
import java.util.Scanner;
class Table
{
	public static void main(String args[])
	{
		int a, b, c,n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The No.");
		n = sc.nextInt();
		System.out.println("Table is Following :");
		while(c<=n)
		{
			System.out.println("\t" +a);
			for(c = 1; c<=10; c++)
			a=n*c;
		}
	}
}