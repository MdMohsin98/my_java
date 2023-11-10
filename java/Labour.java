/** A Programme in Java to find the Salary of Labours */
import java.util.Scanner;
class Labour
{
	public static void main(String args[])
	{
		float a, b, c, d, e, f;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Hours worked by Labour 'A' :");
		a = sc.nextInt();
		d = a*(250/8);
		System.out.println("Total Salary: " +d);
		System.out.print("Enter the Hours worked by Labour 'B' :");
		b = sc.nextInt();
		e = b*(250/8);
		System.out.println("Total Salary: " +e);
		System.out.print("Enter the Hours worked by Mason 'C' :");
		c = sc.nextInt();
		f = c*(400/8);
		System.out.println("Total Salary: " +f);
	}
}