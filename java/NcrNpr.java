/**  A Java Programme to find the NCR and NPR */
import java.util.Scanner;
class NcrNpr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double a, b,c, d=1, e, f=1, g, h, i=1, j, k;
		System.out.print("Enter Any Two Nos. : ");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		for(c=1;c<=a;c++)
		d = d*c;
		System.out.println("Factorial("+a+") = " +d);
		for(e=1;e<=b;e++)
		f = f*e;
		System.out.println("Factorial("+b+") = " +f);
		g = a-b;
		for(h=1;h<=g;h++)
		i = i*h;
		System.out.println("Factorial("+a+"-"+b+") = "+i);
		j = d/(f*i);
		System.out.println("The NCR Value of " +a+ " and " +b+ " is = "+j);
		k = d/i;
		System.out.println("The NPR Value of " +a+ " and " +b+ " is = "+k); 
	
		
	}
}