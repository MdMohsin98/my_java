/*  A Java Programme to Read a No. using Scanner Class*/
import java.util.Scanner;
class Input
{
	public static void main(String args[])
	{
		int a;
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter Any No. ");
		a = sc.nextInt();
		System.out.print("The No. you entered is " +a);
	}
}
