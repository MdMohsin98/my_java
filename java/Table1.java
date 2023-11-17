/** A Java Programme is to generate The Table of any Given No. */
// import java.util.Scanner;
class Table1
{
	public static void main(String args[])
	{
		// Scanner sc = new Scanner(System.in);
		int a, c=0, n;
		System.out.print("The Table is ");
		/*n = sc.nextInt();*/
		for(n = 1;n<=20;n++)
		{
		for(a=1;a<=10;a++)
		{
		c = a*n;
		System.out.println("\t"+n+" X "+a+" = "+c);
		}
		}
		
	}
}