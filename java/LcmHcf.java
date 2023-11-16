/** A Java Programme to find the LCM and HCF of two Nos. */
import java.util.Scanner;
class LcmHcf
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b, i, hcf=1, lcm, min;
		System.out.print("Enter Any Two Nos. : ");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		min = (a<b)?a:b;
		for(i = 1; i<=min ; i++)
		{
			hcf = (a%i==0 && b%i==0)? i : hcf;
		}
		System.out.println("	H. C. F. = "+hcf);
		lcm = (a*b)/hcf;
		System.out.println("	L. C. M. = "+lcm);
	}
}
