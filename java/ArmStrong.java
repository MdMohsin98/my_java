/** A Java Programme to check whether the given no. is Armstrong No. or Not */
import java.util.Scanner;
class ArmStrong
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		// int a, b, c, d;
		System.out.print("Enter Any No. :");
		int a = sc.nextInt();
		while(a!=0)
		{
			int b = a%10;
			a = a/10;
		}
		if(b*b*b + c*c*c + d*d*d == a)
		System.out.println("The No. "+a+ " is Armstrong Number ");
		else
		System.out.println("The No. "+a+ " is not an Armstrong Number ");
	}
}