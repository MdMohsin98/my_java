/*  A Java Programme to Calculate Simple Interest Using
 DataInputStream Class */
import java.io.*;
class SimpleInterestDIS
{
	public static void main(String args[])throws IOException
	{
		int p, r, t; 
		double si;
		DataInputStream dis = new DataInputStream(System.in);
		System.out.print("Enter the value of P : ");
		p = Integer.parseInt(dis.readLine());
		System.out.print("Enter the value of R : ");
		r = Integer.parseInt(dis.readLine());
		System.out.print("Enter the value of T : ");
		t = Integer.parseInt(dis.readLine());
		si = (p*r*t)/100;
		System.out.println("Simple Interest = " +si);
	}
}
