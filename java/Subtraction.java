/* A Java Programme to find the Subtraction of two nos. */
import java.util.Scanner;
class Subtraction
{
	public static void main(String args[])
	
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter The value for A and B");
		a= sc.nextInt();
		b= sc.nextInt();
		c = a-b;
		System.out.println("The Subtraction of "+a+" and "+b+" is "+c);
		sc.close();
	}
}
