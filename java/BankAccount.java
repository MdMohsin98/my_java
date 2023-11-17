/** A Java Programme for a Bank Account */
import java.util.Scanner;
class Bank
{
	String nm;
	long no;
	String type;
	double bal;
	double a, b, d, e;
	int c, z;
	Scanner sc = new Scanner(System.in);
	void assign()
	{
		System.out.print("Account Holder's Name : ");
		nm = sc.nextLine();
		System.out.print("Enter Account Number : ");
		no = sc.nextInt();
		System.out.print("Enter Type of Account : ");
		sc.nextLine();
		type = sc.nextLine();
		System.out.print("Enter Balance Amount in A/c : ");
		bal = sc.nextDouble();
	}
	void deposit()
	{
		System.out.print("Enter Deposit Amount : ");
		a = sc.nextDouble();
		b = a + bal;
	}
	void withdraw()
	{
		System.out.print("Enter Withdrawl Amount : ");
		d = sc.nextDouble();
		e = b-d;
	}
	void disp()
	{
		System.out.println("\nAccount Holder's Name :	"+nm);
		System.out.println("Account Number :	"+no);
		System.out.println("Type of Account :	"+type);
		System.out.println("Your Total Balance :	"+e);
	}
}
public class BankAccount
{
	public static void main(String args[])
	{
		Bank b1 = new Bank();
		b1.assign();
		b1.deposit();
		b1.withdraw();
		b1.disp();
	}
}