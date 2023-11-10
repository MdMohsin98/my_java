/* A Java Programme to Ask for Qualify Job */
import java.util.Scanner;
class Conditional
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String a;
		System.out.print("Enter The Gender of Student: ");
		a = sc.nextLine();
		if(a == "Male")
		sc.nextLine();
		System.out.println("The Student is Eligible for Job");
		if(a == "Female")
		System.out.println("The Student is Not Eligible for Job");
	}
}