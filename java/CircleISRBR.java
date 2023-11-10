/* A Java Programme to Calculate the Area and Circumference of a Circle
using InputStreamReader and BufferedReader Class*/
import java.io.*;
class CircleISRBR
{
	public static void main(String args[])throws IOException
	{
		double a, c, r;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter The Radius: ");
		 r = Double.parseDouble(br.readLine());
		 a = 3.14*r*r;
		 c = 2*3.14*r;
		System.out.println("Area = "+a+" and Circumference = "+c);
	}
}