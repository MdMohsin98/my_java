/*  A Java Programme to Calculate Factorial using InputStreamReader 
and Buffered Reader Class */
import java.io.*;
class FactorialISRBR
{
	public static void main(String args[])throws IOException
	{
		int i, f=1, n;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter Any No.: ");
		n = Integer.parseInt(br.readLine());
		for(i=1;i<=n;i++)
		f = f*i;
		System.out.println("Factorial = " +f);	
	}
}
