/*  A Java Programme to Calculate Factorial using DataInputStream Class */
import java.io.*;
class FactorialDIS
{
	public static void main(String args[])throws IOException
	{
		int i, f=1, n;
		DataInputStream dis = new DataInputStream(System.in);
		System.out.print("Enter Any No.: ");
		n = dis.readInt();
		for(i=1;i<=n;i++)
		f = f*i;
		System.out.println("Factorial = " +f);	
	}
}
