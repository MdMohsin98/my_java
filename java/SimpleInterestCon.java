/*  A Java Programme to Calculate Simple Interest Using Console Class */
import java.io.*;
class SimpleInterestCon
{
	public static void main(String args[])
	{
		int p, r, t; 
		double si;
		Console c = System.console();
		p = Integer.parseInt(c.readLine("Enter The Value of P: "));
		r = Integer.parseInt(c.readLine("Enter The Value of R: "));
		t = Integer.parseInt(c.readLine("Enter The Value of T: "));
		si = (p*r*t)/100;
		System.out.println("Simple Interest = " +si);
	}
}
