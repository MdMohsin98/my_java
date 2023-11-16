/** A Java Programme to solve the Two linear equations */
import java.util.Scanner;
class LinearEquation
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, m, n, x1, x2;
		System.out.print("Enter the values of a, b, c, d, m and n :");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		m = sc.nextInt();
		n = sc.nextInt();
		System.out.println("Now The Equation is Following : ");
		System.out.println("\n\t"+a+"x1 + "+b+"x2 = "+m);
		System.out.println("\t"+c+"x1 + "+d+"x2 = "+n+ "\n");
		System.out.println("Solution is Below : \n");
		if((a*d-c*b) != 0)
		{
			x1 = (m*d-b*n)/(a*d-c*b);
			x2 = (n*a-m*c)/(a*d-c*b);
			System.out.println("\tx1 = "+x1);
			System.out.println("\tx2 = "+x2);
		}
		else
		System.out.println("Input Correctly ");
		sc.close();
	}
}