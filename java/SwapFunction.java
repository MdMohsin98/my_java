/** A Java Programme to read two nos. from keyboard and swap their 
values using function */
import java.util.Scanner;
class SwapFunction
{
	public static void swap(int a, int b)
	{
		a = a*b;
		b = a/b;
		a = a/b;
		System.out.println(" A = "+a+" and B = "+b+" After Swapping their values ");
	}
	public static void main(String args[])
	{
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Two Nos. :");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("A = " +a+ " and B = " +b+" Before Swapping their values ");
		swap(a, b);
	}
}