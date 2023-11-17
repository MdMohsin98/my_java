/** A Java Programme to Calculate Simple and Compound Interest */
import java.util.Scanner;
import java.lang.Math;
class SiCiTest
{
	int t;
	double p, r, si, ci;
	void simple()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\t Simple Interest \n ");
		System.out.print("Enter The Value of P , R and T : ");
		p = sc.nextDouble();
		r = sc.nextDouble();
		t = sc.nextInt();
		si = (p*r*t)/100;
		System.out.println("Simple Interest : "+si);
	
		sc.close();
	}
	void compound()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\t Compound Interest \n ");
		System.out.print("Enter The Value of P , R and T : ");
		p = sc.nextDouble();
		r = sc.nextDouble();
		t = sc.nextInt();
		ci = p*(Math.pow((1+r/100),t));
		System.out.println("Compound Interest : "+ci);
	
		sc.close();
	}
}
public class SiCi
{
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		SiCiTest i1 = new SiCiTest();
		System.out.print("\n1. Simple Interest\n2. Compound Interest\nChoose Any: ");
		n = sc.nextInt();
		switch(n)
		{
			case 1: i1.simple(); break;
			case 2: i1.compound(); break;
			default: System.out.println("Input Correctly ");
		}
		sc.close();
	}
}