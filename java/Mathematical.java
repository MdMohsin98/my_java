/** A java Programme to Calculate all Mathematical Functions */
import java.lang.Math;
import java.util.Scanner;
class Mathematical
{
	public static void main(String args[])
	{
		double a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, ab, ac, ad, ae, af, ag, ah;
		Scanner sc = new Scanner(System.in);
		System.out.println("Note: Any Angle Should Be Given in Radians ");
		System.out.print("Enter Any Angel for Trigonometric Calculation: ");
		a = sc.nextDouble();
		sc.close();
		b = Math.sin(a);
		c = Math.cos(a);
		d = Math.tan(a);
		e = Math.asin(a);
		f = Math.acos(a);
		g = Math.atan(a);
		System.out.println("sin("+a+ ")	= " +b);
		System.out.println("cos("+a+ ") 	= " +c);
		System.out.println("tan("+a+ ") 	= " +d);
		System.out.println("cosec("+a+ ")	= " +e);
		System.out.println("sec("+a+ ") 	= " +f);
		System.out.println("cot("+a+ ") 	= " +g);
		System.out.print("Enter the Two Angels in Radians for tan value of : ");
		h = sc.nextDouble();
		i = sc.nextDouble();
		j = Math.atan2(h,i);
		System.out.println("tan("+h+ ","+i+")	= " +d+" beteween two angles");
		System.out.print("Enter Any No. and its Power for Power Multiplication : ");
		k = sc.nextDouble();
		l = sc.nextDouble();
		m = Math.pow(k,l);
		System.out.println("Result = "+m);
		System.out.println("Enter the Power of Exponential Term 'e' for Exponential Value: ");
		n = sc.nextDouble();
		o = Math.exp(n);
		System.out.println("Result = "+o);
		System.out.print("Enter Any No. for 'log' calculation: ");
		p = sc.nextDouble();
		q = Math.log(p);
		System.out.println("log("+p+") = "+q);
		System.out.print("Enter Any No. for Square Root calculation: ");
		r = sc.nextDouble();
		s = Math.sqrt(r);
		System.out.println("Square Root ("+r+") = "+s);
		System.out.print("Enter Any No. 'ceil' calculation : ");
		t = sc.nextDouble();
		u = Math.ceil(t);
		System.out.println("ceil("+t+") = "+u);
		System.out.print("Enter Any No. for 'floor' calculation : ");
		v = sc.nextDouble();
		w = Math.floor(v);
		System.out.println("floor("+v+") = "+w);
		System.out.print("Enter Any No. for 'rint' calculation : ");
		x = sc.nextDouble();
		y = Math.rint(x);
		System.out.println("rint("+x+") = "+y);
		System.out.print("Enter Any No. for Abstract Value : ");
		z = sc.nextDouble();
		ab = Math.abs(z);
		System.out.println("abs("+z+") = "+ab);
		System.out.print("Enter Any Two No. for Comparing as Maximum No. : ");
		ac = sc.nextDouble();
		ad = sc.nextDouble();
		ae = Math.max(ac, ad);
		System.out.println("max("+ac+","+ad+") = "+ae);
		System.out.print("Enter Any Two No. for Comparing as Minimum No.  : ");
		af = sc.nextDouble();
		ag = sc.nextDouble();
		ah = Math.min(af, ag);
		System.out.println("min("+af+","+ag+") = "+ah);
		System.out.println("Calculation of Ncr and Npr :");
		double A, B, C, D=1, E, F=1, G, H, I=1, J, K;
		System.out.print("Enter Any Two Nos. : ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		for(C=1;C<=A;C++)
		D = D*C;
		System.out.println("Factorial("+A+") = " +D);
		for(E=1;E<=B;E++)
		F = F*E;
		System.out.println("Factorial("+B+") = " +F);
		G = A-B;
		for(H=1;H<=G;H++)
		I = I*H;
		System.out.println("Factorial("+A+"-"+B+") = "+I);
		J = D/(F*I);
		System.out.println("The NCR Value of " +A+ " and " +B+ " is = "+J);
		K = D/I;
		System.out.println("The NPR Value of " +A+ " and " +B+ " is = "+K); 
	}
}