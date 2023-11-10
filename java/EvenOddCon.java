/* A Java Programme to take input by Console Class */
import java.io.*;
class EvenOddCon
{
	public static void main(String arg[])
	{
		Console c = System.console();
		int a = Integer.parseInt(c.readLine("Enter any No. "));
		if(a%2==0)
		System.out.println("The No. is Even ");
		else
		System.out.println("The No. is Odd ");
	}
}