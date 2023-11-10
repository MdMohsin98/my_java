/** A Java Programme which includes all Operators in Java */
import java.util.Scanner;
class Operators
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, e, g, s, t, u, v, w, x, y, z;
		boolean h, i, j, k, l, m, n, o, p;
		String q, r;
		double f;
		System.out.print("Enter Any Two Nos.: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a+b;
		d = a-b;
		e = a*b;
		f = a/b;
		g = a%b;
		System.out.println("\n		1. Arithematic Operator\n ");
		System.out.println("Result of + Operator : "+c);
		System.out.println("Result of - Operator : "+d);
		System.out.println("Result of x Operator : "+e);
		System.out.println("Result of / Operator : "+f);
		System.out.println("Result of % Operator : "+g);
		System.out.println("\n		2. Relational Operator\n ");
		h = a<b;
		i = a<=b;
		j = a>b;
		k = a>=b;
		l = a==b;
		m = a!=b;
		System.out.println("Result of < Operator : "+h);
		System.out.println("Result of <= Operator : "+i);
		System.out.println("Result of > Operator : "+j);
		System.out.println("Result of >= Operator : "+k);
		System.out.println("Result of == Operator : "+l);
		System.out.println("Result of != Operator : "+m);
		System.out.println("\n		3. Logical Operator\n ");
		n = (a>b)&&(b>a);
		o = (a>b)||(b>a);
		p = !(a>b);
		System.out.println("Result of && Operator : "+n);
		System.out.println("Result of || Operator : "+o);
		System.out.println("Result of ! Operator : "+p);
		System.out.println("\n		4. Conditional Operator\n ");
		q = (a%2==0)? "Even":"Odd";
		r = (b%2==0)? "Even":"Odd";
		System.out.println("Result of ? Operator for "+a+" : "+q);
		System.out.println("Result of ? Operator for "+b+" : "+r);
		System.out.println("\n		5. Bitwise Operator\n ");
		s = a&b;
		t = a|b;
		u = a^b;
		v = ~a;
		w = ~b;
		System.out.println("Result of Bitwise AND & Operator : "+s);
		System.out.println("Result of Bitwise OR | Operator : "+t);
		System.out.println("Result of Bitwise XOR ^ Operator : "+u);
		System.out.println("Result of Bitwise 1's Complement ~ Operator : "+v);
		System.out.println("Result of Bitwise 1's Complement ~ Operator : "+w);
		System.out.println("\n		6. Shift Operator\n ");
		x = a<<b;
		y = a>>b;
		z = a>>>b;
		System.out.println("After Using : ");
		System.out.println("	Left Shift Operator :	"+x);
		System.out.println("	Right Shift Operator :	"+y);
		System.out.println("	Unsigned Right Shift Operator :	"+z);
	}
}