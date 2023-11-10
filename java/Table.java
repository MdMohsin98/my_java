/* A Java Programme to Generate the Table */
import java.util.Scanner;
class Table
{
	public static void main(String args[])
	{
		int a, c, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The No.");
		n = sc.nextInt();
		System.out.println("Table is Following :");
		a = 1;
		while(a<=10){
			c=n*a;
			System.out.println(c);
			a++;
			}
		}
	}