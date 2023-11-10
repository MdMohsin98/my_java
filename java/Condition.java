/* A Java Programme to take input as Character */
import java.util.Scanner;
class Condition
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print("Enter the Gender : ");
		str = sc.nextLine();
		if(str == "Male")
		sc.nextLine();
		System.out.println("The Person is Eligible ");
		if(str == "Female")
		System.out.println("The Person is Not Eligible ");
	}
}