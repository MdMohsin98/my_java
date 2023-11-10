/** A Java Programme to calculate the Result */
import java.lang.Math;
import java.util.Scanner;
class Result
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		System.out.print("Enter Percentage Marks of InterMediate Exam : ");
		a = sc.nextDouble();
		b = a*5;
		c = Math.abs(b);
		System.out.println("Total Marks = "+c);
	}
}