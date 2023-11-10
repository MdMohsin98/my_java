/* A Java Programme to Calculate the Area and Circumference of a Circle
using DataInputStream Class*/
import java.io.*;
class CircleDIS
{
	public static void main(String args[])throws IOException
	{
		double a, c, r;
		DataInputStream dis = new DataInputStream(System.in);
		System.out.print("Enter The Radius: ");
		 r = Double.parseDouble(dis.readLine());
		 a = 3.14*r*r;
		 c = 2*3.14*r;
		System.out.println("Area = "+a+" and Circumference = "+c);
	}
}