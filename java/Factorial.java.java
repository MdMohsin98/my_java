import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		double a, b, c=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any No. ");
		b  = sc.nextDouble();
		for(a=1;a<=b;a++)
		c = c*a;
		System.out.println("Factorial = " +c);
	}
}