/*  A Java Programme to Calculate Simple Interest Using
 InputStreamReader and BufferedReader Class */
import java.io.*;
class SimpleInterestISRBR
{
	public static void main(String args[])throws IOException
	{
		int p, r, t; 
		double si;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter the value of P : ");
		p = Integer.parseInt(br.readLine());
		System.out.print("Enter the value of R : ");
		r = Integer.parseInt(br.readLine());
		System.out.print("Enter the value of T : ");
		t = Integer.parseInt(br.readLine());
		si = (p*r*t)/100;
		System.out.println("Simple Interest = " +si);
	}
}
