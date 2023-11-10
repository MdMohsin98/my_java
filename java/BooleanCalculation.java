/** A Java Programme to Calculate the Boolean Functions */
import java.util.Scanner;
class BooleanCalculation
{
	public static void main(String args[])
	{
		double a , b , c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of A, B and C : ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		System.out.println("The Boolean Logics Are Following : ");
		boolean d = a>b&&a<c; 
		boolean e = a<b&&a>c;
		boolean f = a==c||a>0;
		boolean g = b>15&&c<0||a>0;
		boolean h = (a/2.0==0.0&&b/2.0!=0.0)||c<0.0;
		boolean i = a>c&&a<b||a>b&&b<=a;
		System.out.println("( a > b && a<c )	=	"+d);
		System.out.println("( a < b && a > c )	=	"+e);
		System.out.println("( a == c || a > 0 )	=	"+f);
		System.out.println("( b > 15 && c < 0 || a > 0 )	=	"+g);
		System.out.println("( (a / 2.0 == 0.0 && b / 2.0 != 0.0) || c < 0.0 )=	"+h);
		System.out.println("( a > c && a < b || a > b  && b <= a  ) = " +i); 
	}
}