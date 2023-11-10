/** A Programme to Calculate the Sales Tax */
import java.util.Scanner;
class SalesTax
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double p, t;
		System.out.print("Input the Price : ");
		p = sc.nextInt();
		t = p*(12.35/100);
		System.out.println("Sales Tax : " +t);
	}
}