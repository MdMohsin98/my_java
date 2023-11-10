/* A Java Programme to Generate The Harmonic Series */
import java.util.Scanner;
class Harmonic1
{
	public static void main(String args[])
	{
		int a,n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Last No. of Series: ");
		n = sc.nextInt();
		System.out.println("\t The Harmonic Series is Following: ");
		for(a=1;a<=n;a++)
		{
			
			System.out.println("\t\t1/"+a);
		}
	}
}