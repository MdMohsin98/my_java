/** Method Overloading */
class Ab
{
	int a, b;
	Ab()
	{
		a = 5;
		b = 10;
	}
	void disp()
	{
		System.out.println("A = "+a+" B = "+b);
	}
	void sum()
	{
		System.out.println("Sum = "+(a+b));
	}
	void sum(int x, int y)
	{
		System.out.println("Sum = "+(x+y));
	}
	void sum(double x, double y)
	{
		System.out.println("Sum = "+(x+y));
	}
	void sum(int a, int b, int c)
	{
		System.out.println("Sum = "+(a+b+c));
	}
}
class MethodOverloading
{
	public static void main(String args[])
	{
		Ab p = new Ab();
		p.disp();
		p.sum();
		p.sum(5.2, 3.5);
		p.sum(10,4);
		p.sum(10,20,30);		
	}
}