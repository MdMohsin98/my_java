/*  A Java Programme to Calculate Factorial using Console Class */
import java.io.*;
class FactorialCon
{
	public static void main(String args[])
	{
		Console c = System.console();
		int i, f=1, n;
		n = Integer.parseInt(c.readLine("Enter Any No.: "));
		for(i=1;i<=n;i++)
		f = f*i;
		System.out.println("Factorial = " +f);	
	}
}
