/** A Java Programme to Write Name in Hindi */
import java.util.Scanner;
class HindiTyping
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i;
		char j;
		System.out.println("\n" +"\u2310"+"\u2344"+"\u2381"+"\u2342");
		for(i = 2309; i<=2407; i++)
		System.out.print(Integer.toHexString(i)+" => " +(char)i+"	");
	}
}
		