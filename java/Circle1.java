/** A Java Programme to declare the various types of Variables */
class Circle1
{
	double r; //Instance Variable
	public static final double PI = 3.14; //Static Variable or Class Variable
	void circle()
	{
		r = 1.5;
	}
	void circle(double x)
	{
		r = x;
	}
	void disp()
	{
		System.out.println("Radius = "+r);
	}
	void area()
	{
		double ar;
		ar = PI*r*r;
		System.out.println("Area = "+ar);
	}
	void circum()
	{
		double cr; //Local Variable
		cr = 2*PI*r;
		System.out.println("Circumference = "+cr);
	}
};
class AllVarEg
{
	public static void main(String args[])
	{
		Circle1 c1 = new Circle1();
		Circle1 c2 = new Circle1();
		System.out.println("C1 : ");
		c1.disp();
		c1.area();
		c1.circum();
		System.out.println("C2 : ");
		c2.disp();
		c2.area();
		c2.circum();
	}
}