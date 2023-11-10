/** A Java Programme to read two nos. from keyboard and swap their 
values */
import java.util.Scanner;
class Swap
{
	public static void main(String args[])
	{
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Two Nos. :");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("A = " +a+ " and B = " +b);
		System.out.println("After Swapping ");
		System.out.println("A = " +b+ " and B = "+a);
	}
}