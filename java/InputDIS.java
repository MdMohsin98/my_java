/*  A Java Programme to Read a No. using DataInputStream Class*/
import java.io.*;
class InputDIS
{
	public static void main(String args[])throws IOException
	{
		int a;
		DataInputStream dis = new DataInputStream(System.in);
		System.out.print("Enter Any No. : ");
		a = dis.readInt();
		System.out.print("The No. you entered is " +a);
	}
}
