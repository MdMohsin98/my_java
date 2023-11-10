/*  A Java Programme to Read a No. using InputStreamReader 
and BufferedReader Class*/
import java.io.*;
class InputISRBR
{
	public static void main(String args[])throws IOException
	{
		int a;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter Any No. : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("The No. you entered is " +a);
	}
}
