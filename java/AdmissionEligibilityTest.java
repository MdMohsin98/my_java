/** Admission Eligibility Test */
import java.util.Scanner;
class AdmissionEligibilityTest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int p, c, m, t, T;
		System.out.print("Enter The Marks of Physics, Chemistry & Mathematics : ");
		p = sc.nextInt();
		c = sc.nextInt();
		m = sc.nextInt();
		t = p + c + m;
		T = p+m;
		if(p>=50 && c>=40 && m>=60 && (t>=200 || T>=150))
		System.out.println("\n\tThe Student is Eligible ");
		else
		System.out.println("\n\tThe Student is Not Eligible ");
	}
}