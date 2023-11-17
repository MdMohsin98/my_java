/** A Java Programme to read three nos. from keyboard and swap their 
values */
import java.util.Scanner;
class Swap3
{
	public static void main(String args[])
	{
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Three Nos. :");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println("A = " +a+ ", B = " +b+" and C = "+c);
		System.out.println("After Swapping ");
		System.out.println("A = " +b+ ", B = "+c+" and C = "+a);
		sc.close();
	}
}