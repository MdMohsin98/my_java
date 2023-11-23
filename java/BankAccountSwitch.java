/** Bank Account */
import java.util.Scanner;
class BankAccountSwitch
{
	public static void main(String args[])
	{
		int a, in=0, n=0;
		String nm=null, fnm=null, job=null, q=null;
		double b;
		Scanner sc = new Scanner(System.in);
		System.out.print("For New Customer Press 1\nFor Existing Customer press 2\n");
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
		switch(a)
		{
			case 2: System.out.println("Deposit");
			case 3: System.out.println("Debit");
		}
		if(n == 0)
		System.out.println("Enter Amount : ");
		b = sc.nextInt();
		System.out.println("Your Total Amount : "+b);
		System.out.println("Account Details.");
		System.out.println("Name: "+nm);
		System.out.println("Father's Name: "+fnm);
		System.out.println("Job: "+job);
		System.out.println("Total Income: "+in);
		System.out.println("Qualification: "+q);

		sc.close();
		
	}
}
		
			
			
			
		