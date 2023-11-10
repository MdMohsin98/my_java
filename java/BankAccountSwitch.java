/** Bank Account */
import java.util.Scanner;
class BankAccountSwitch
{
	public static void main(String args[])
	{
		int a, in, n=0;
		String nm, fnm, job, q;
		double b, c, d, e, f, g, h;
		Scanner sc = new Scanner(System.in);
		System.out.print("Are You A New Customer ?\n1: Yes\n2: No\nChoose Any : ");
		a = sc.nextInt();
		if(a == 1)
		{
			System.out.print("Enter Your Name :");
			sc.nextLine();
			nm = sc.nextLine();
			System.out.print("Enter Your Fathers Name : ");
			fnm = sc.nextLine();
			System.out.print("Job : ");
			job = sc.nextLine();
			System.out.print("Total Income : ");
			in = sc.nextInt();
			System.out.print("Qualification : ");
			sc.nextLine();
			q = sc.nextLine();
		}
		else
		switch(n)
		{
			case 1: System.out.println("Deposit");
			case 2: System.out.println("Debit");
		}
		if(n == 0)
		System.out.println("Enter Amount : ");
		b = sc.nextInt();
		System.out.println("Your Total Amount : "+b);
		
	}
}
		
			
			
			
		