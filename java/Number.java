/* A java programme to take input of any No. */
import java.util.Scanner;
class Number
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println(" Enter any Two No. ");
		a = sc.nextInt();
		b = sc.nextInt();
		if(a<b)
		{System.out.println("Smallest Integer = " +a);
		System.out.println(+b+" is not less than "+a);
		System.out.println("Largest Integer = " +b);
		System.out.println(+a+" is not greater than " +b);}
		else
		{System.out.println("Smallest Integer = " +b);
		System.out.println(+a+" is not less than " +b);
		System.out.println("Largest No. = "+a);
		System.out.println(+b+" is not greater than " +a);}
	}
}