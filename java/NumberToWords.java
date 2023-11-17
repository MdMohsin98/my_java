/** A Java programme to convert any no. into word */
import java.util.Scanner;
class NumberToWords
{
	public static void main(String args[])
	{
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any No. :");
		s = sc.nextLine();
		for(int b = 0; b<s.length(); b++)
		{
			char ch=s.charAt(b);
		switch(ch)
		{
			case '0' : System.out.print("Zero "); break;	
			case '1' : System.out.print("One "); break;
			case '2' : System.out.print("Two "); break;
			case '3' : System.out.print("Three "); break;
			case '4' : System.out.print("Four "); break;
			case '5' : System.out.print("Five "); break;
			case '6' : System.out.print("Six "); break;
			case '7' : System.out.print("Seven "); break;
			case '8' : System.out.print("Eight "); break;
			case '9' : System.out.print("Nine "); break;	
		}
		}
		sc.close();
	}
}