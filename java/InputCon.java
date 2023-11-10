/*  A Java Programme to Read a No. using Console Class*/
import java.io.*;
class InputCon
{
	public static void main(String args[])
	{
		int a;
		Console c = System.console();
		a = Integer.parseInt(c.readLine("Enter Any No. : "));
		System.out.print("The No. you entered is " +a);
	}
}
