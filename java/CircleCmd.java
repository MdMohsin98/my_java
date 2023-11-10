/* A Java Programme to Calculate the Area and Circumference of a Circle
using Command Line Class*/
class CircleCmd
{
	public static void main(String args[])
	{
		double a, c, r;
		r = Double.parseDouble(args[0]);
		a = 3.14*r*r;
		c = 2*3.14*r;
		System.out.println("Area = "+a+" and Circumference = "+c);
	}
}