/** A java Programme to Calculate all Mathematical Functions */
import java.lang.Math;
import java.util.Scanner;
class Mathematical
{
	public static void main(String args[])
	{
		double a, h, i, k, l, n, p, r, t, v, x, z, ac, ad, af, ag;
		Scanner sc = new Scanner(System.in);
		System.out.println("Note: Any Angle Should Be Given in Radians ");
		System.out.print("Enter Any Angel for Trigonometric Calculation: ");
		a = sc.nextDouble();

		System.out.println("sin("+a+ ")	= " +Math.sin(a));
		System.out.println("cos("+a+ ") 	= " +Math.cos(a));
		System.out.println("tan("+a+ ") 	= " +Math.tan(a));
		System.out.println("cosec("+a+ ")	= " +Math.asin(a));
		System.out.println("sec("+a+ ") 	= " +Math.acos(a));
		System.out.println("cot("+a+ ") 	= " +Math.atan(a));
		System.out.print("Enter the Two Angels in Radians for tan value of : ");
		h = sc.nextDouble();
		i = sc.nextDouble();
		System.out.println("tan("+h+ ","+i+")	= " +Math.atan2(h,i)+" beteween two angles");
		System.out.println("cot("+h+ ","+i+")	= " +1/(Math.atan2(h,i))+" beteween two angles");
		System.out.print("Enter Any No. and its Power for Power Multiplication : ");
		k = sc.nextDouble();
		l = sc.nextDouble();
		System.out.println("Result = "+Math.pow(k,l));
		System.out.println("Enter the Power of Exponential Term 'e' for Exponential Value: ");
		n = sc.nextDouble();
		System.out.println("Result = "+Math.exp(n));
		System.out.print("Enter Any No. for 'log' calculation: ");
		p = sc.nextDouble();
		System.out.println("log("+p+") = "+Math.log(p));
		System.out.print("Enter Any No. for Square Root calculation: ");
		r = sc.nextDouble();
		System.out.println("Square Root ("+r+") = "+Math.sqrt(r));
		System.out.print("Enter Any No. 'ceil' calculation : ");
		t = sc.nextDouble();
		System.out.println("ceil("+t+") = "+Math.ceil(t));
		System.out.print("Enter Any No. for 'floor' calculation : ");
		v = sc.nextDouble();
		System.out.println("floor("+v+") = "+Math.floor(v));
		System.out.print("Enter Any No. for 'rint' calculation : ");
		x = sc.nextDouble();
		System.out.println("rint("+x+") = "+Math.rint(x));
		System.out.print("Enter Any No. for Abstract Value : ");
		z = sc.nextDouble();
		System.out.println("abs("+z+") = "+Math.abs(z));
		System.out.print("Enter Any Two No. for Comparing as Maximum No. : ");
		ac = sc.nextDouble();
		ad = sc.nextDouble();
		System.out.println("max("+ac+","+ad+") = "+Math.max(ac, ad));
		System.out.print("Enter Any Two No. for Comparing as Minimum No.  : ");
		af = sc.nextDouble();
		ag = sc.nextDouble();
		System.out.println("min("+af+","+ag+") = "+Math.min(af, ag));
		System.out.println("Calculation of Ncr and Npr :");
		double A, B, C, D=1, E, F=1, G, H, I=1;
		System.out.print("Enter Any Two Nos. : ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		sc.close();
		for(C=1;C<=A;C++){
			D = D*C;
		}
		System.out.println("Factorial("+A+") = " +D);
		for(E=1;E<=B;E++){
			F = F*E;
		}
		System.out.println("Factorial("+B+") = " +F);
		G = A-B;
		for(H=1;H<=G;H++){
			I = I*H;
		}
		System.out.println("Factorial("+A+"-"+B+") = "+I);
		System.out.println("The NCR Value of " +A+ " and " +B+ " is = "+D/(F*I));
		System.out.println("The NPR Value of " +A+ " and " +B+ " is = "+D/I); 
	}
}