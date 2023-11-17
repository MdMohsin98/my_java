/** A java programme to read the records of n book */
import java.util.Scanner;
class Book
{
	String nm;
	int price;
	int edition;
	String author;
	String publication;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Book Name : ");
		sc.nextLine();
		nm = sc.nextLine();
		System.out.print("Enter Price : ");
		price = sc.nextInt();
		System.out.print("Enter Edition(in no.) : ");
		edition = sc.nextInt();
		System.out.print("Enter Author Name : ");
		sc.nextLine();
		author = sc.nextLine();
		System.out.print("Enter Publication : ");
		publication = sc.nextLine();
		sc.close();
	}
	void disp()
	{
		System.out.println("\n\nName :\t"+nm);
		System.out.println("Price :\t"+price);
		if(edition == 1)
		{System.out.println("Edition :\t"+edition+"st");}
		else if(edition == 2)
		{System.out.println("Edition :\t"+edition+"nd");}
		else if(edition == 3)
		{System.out.println("Edition :\t"+edition+"rd");}
		else
		{System.out.println("Edition :\t"+edition+"th");}
		System.out.println("Author Name :\t"+author);
		System.out.println("Publication :\t"+publication);
	}
}
public class BookTest
{
	public static void main(String args[])
	{
		Book b = new Book();
		b.input();
		b.disp();
	}
}
		