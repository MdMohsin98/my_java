/*  A Java Programme to Calculate Simple Interest Using Scanner Class */
import java.util.Scanner;
class SimpleInterestScr
{
	public static void main(String args[])
	{
		int p, r, t; 
		double si;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value of P, R and T");
		p = sc.nextInt();
		r = sc.nextInt();
		t = sc.nextInt();
		si = (p*r*t)/100;
		System.out.println("Simple Interest = " +si);
		sc.close();
	}
}
