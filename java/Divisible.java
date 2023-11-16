/** A Java programme to check the given no. is divisible by 3 and 7 or Not */
import java.util.Scanner;
class Divisible
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("Enter any No. : ");
		a = sc.nextInt();
		if(a%3==0 && a%7==0)
		System.out.println("The No. "+a+" is divisible by 3 and 7");
		else
		System.out.println("The No. "+a+" is Not divisible by 3 and 7");
		sc.close();		
	}
}