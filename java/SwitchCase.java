/** A Java Programme to define the Switch case statement */
import java.util.Scanner;
class SwitchCase
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter Your Choice \n1. Sunday\n2. Monday\n3. Tuesday\n4. Wednesday\n5. Thursday\n6. Friday\n7. Saturday ");
		System.out.print("Enter the no. of Days:  ");
		a = sc.nextInt();
		switch(a)
		{
			case 1: System.out.println("\n		Sunday\n ");
			break;
			case 2: System.out.println("\n		Monday\n ");
			break;
			case 3: System.out.println("\n		Tuesday\n ");
			break;
			case 4: System.out.println("\n		Wednesday\n ");
			break;
			case 5: System.out.println("\n		Thursday\n ");
			break;
			case 6: System.out.println("\n		Friday\n ");
			break;
			case 7: System.out.println("\n		Saturday\n ");
			break;
			default : System.out.println("Input Correctly ");
		}
	}
}