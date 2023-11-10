/* A Java Programme to Calculate the Area and Circumference of a Circle
using Console Class*/
import java.io.*;
class CircleCon
{
	public static void main(String args[])
	{
		double a, c, r;
		Console con = System.console();
		 r = Double.parseDouble(con.readLine("Enter The Radius: "));
		 a = 3.14*r*r;
		 c = 2*3.14*r;
		System.out.println("Area = "+a+" and Circumference = "+c);
	}
}