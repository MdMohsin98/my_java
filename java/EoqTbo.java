/** A Java Programme to Calculate the Economic Order Quantity and Time Betweem Order */
import java.lang.Math;
import java.util.Scanner;
class EoqTbo
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		double eoq, tbo, dr, sc, hcpiput, a, b;
		System.out.print("Enter the Demand Rate : ");
		dr = s.nextDouble();
		System.out.print("Setup Cost : "); 
		sc = s.nextDouble();
		System.out.print("Holding Cost :");
		hcpiput = s.nextDouble();
		try
		{
			eoq = (2*dr*sc)/hcpiput;
			tbo = (2*sc)/(dr*hcpiput);
			a = Math.sqrt(eoq);
			b = Math.sqrt(tbo);
			System.out.println("Economic Order Quantity(EOQ) = " +a);
			System.out.println("Time Betweem Orders(TBO) = " +b);
		}
		catch(Exception e)
		{
			System.out.println("Please Input Correctly : ");
		}
	}
}