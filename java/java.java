import java.lang.Math;
import java.util.Scanner;
class java
{
	public static void main(String args[])
	{
		double x ,y;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Number: ");
		x = sc.nextInt();
		y = Math.sqrt(x);
		System.out.print("Square Root = " +y);
		sc.close();
	}
}