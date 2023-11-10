/** A Java Programme to Calculate the equivalent Resistance when 
connected in Series Combination */
import java.util.Scanner;
class ResistanceSeries
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double r1, r2, r3, re;
		System.out.print("Enter The Value of R1, R2 and R3 :");
		r1 = sc.nextInt();
		r2 = sc.nextInt();
		r3 = sc.nextInt();
		re = r1+r2+r3;
		System.out.println("Equivalent Resistance = "+re);
	}
}
		