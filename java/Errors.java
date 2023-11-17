/** A Programme in Java to Find Errors in Input */
import java.util.Scanner;
class Errors
{
	public static void main(String args[])
	{
		int a, b, c, d, e;
		Scanner s = new Scanner(System.in);
		System.out.print(" Enter any Five Nos. ");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		d = s.nextInt();
		e = s.nextInt();
		String f = (a == (int)a)? "Correct":"Not Correct";
		String g = (b == (int)b)? "Correct":"Not Correct";
		String h = (c == (int)c)? "Correct":"Not Correct";
		String i = (d == (int)d)? "Correct":"Not Correct";
		String j = (e == (int)e)? "Correct":"Not Correct";

		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		s.close();
	}
}