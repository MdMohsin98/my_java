import java.util.Scanner;
class Addition
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter Two Nos. ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a+b;
		System.out.println("Sum of "+a+" and "+b+" is= "+c);
	}
}