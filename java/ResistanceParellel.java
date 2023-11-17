/** A Java Programme to Calculate the equivalent Resistance when 
connected in Parllel Combination */
import java.util.Scanner;
class ResistanceParellel
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double r1, r2, re;
		System.out.print("Enter The Value of R1 and R2 :");
		r1 = sc.nextInt();
		r2 = sc.nextInt();
		re = 1/((1/r1)+(1/r2));
		System.out.println("Equivalent Resistance = "+re);
		sc.close();
	}
}
		