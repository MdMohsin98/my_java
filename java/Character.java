/** A Java Programme to take input as Character*/
import java.util.Scanner;
class Character
{
	public static void main(String args[])
	{
		String c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Character : ");
		//sc.nextLine(); // This is used when any no. has been taken input before this;
		c = sc.nextLine();
		System.out.println("You Entered :	" +c);
		sc.close();
	}
}