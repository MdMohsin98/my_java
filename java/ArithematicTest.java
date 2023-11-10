/** A Java Programme to perform Arithematic Operations */
import java.util.Scanner;
import java.lang.Math;
class Arithematic
{
	double a, b, c, d, e, f, g, h, i;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Values of A & B : ");
		a = sc.nextDouble();
		b = sc.nextDouble();
	}
	void disp()
	{
		System.out.println("A = "+a+ " & B = "+b);
	}
	void add()
	{
		c = a+b;
		System.out.println("Addition = "+c);
	}
	void sub()
	{
		if(a>b){ d = a-b;}
		else d = b-a;
		System.out.println("Subtraction = "+d);
	}
	void mul()
	{
		e = a*b;
		System.out.println("Multiplication = "+e);
	}
	void div()
	{
		if(a>b) {f = a/b;}
		else f = b/a;
		System.out.println("Division = "+f);
	}
	void max()
	{
		g = Math.max(a,b);
		System.out.println("Maximum = "+g);
	}
	void min()
	{
		h = Math.min(a,b);
		System.out.println("Minimum = "+h);
	}
	void avg()
	{
		i = (a+b)/2;
		System.out.println("Average = "+i);
	}


}
public class ArithematicTest
{
	public static void main(String args[])
	{
		Arithematic a1 = new Arithematic();
		a1.input();
		a1.disp();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
		a1.max();
		a1.min();
		a1.avg();
	}
}