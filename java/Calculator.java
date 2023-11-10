/** Calculator */
import java.util.Scanner;
import java.lang.Math;
class Calculator
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double a, b, c, d, e, f, g, h, i, j, k, l;
		int  n;
		System.out.println("\t 1. Addition \n\t 2. Subtraction \n\t 3. Multiplication \n\t 4. Division \n\t 5. Square \n\t 6. Square Root ");
		System.out.print("Choose Anyone : ");
		n = sc.nextInt();
		System.out.print("Enter Any Two Numbers ");
		a = sc.nextDouble();
		b = sc.nextDouble();




		g = a*a;
		h = b*b;
		i = Math.sqrt(a);
		j = Math.sqrt(b);
		switch(n)
		{
			case 1:
			c = a+b;
			System.out.println("\t"+a+" + "+b+" = "+c); break;
			case 2:
			if(a>b)
			{d = a-b;
			System.out.println("\t"+a+" - "+b+" = "+d); }
			else
			d = b-a;
			System.out.println("\t"+b+" - "+a+" = "+d); break;
			case 3:
			e = a*b;
			System.out.println("\t"+a+" x "+b+" = "+e); break;
			case 4:
			if(a>b)
			{f = a/b;
			System.out.println("\t"+a+" / "+b+" = "+f);}
			else
			f = b/a;
			System.out.println("\t"+b+" / "+a+" = "+f); break;
			case 5:
			System.out.println(+a+" x "+a+" = "+g);
			System.out.println(+b+" x "+b+" = "+h);break;
			case 6:
			System.out.println("Square Root of "+a+" = "+i);
			System.out.println("Square Root of "+b+" = "+j);break;

		}
	}
}