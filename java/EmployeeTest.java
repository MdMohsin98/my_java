/** A Java Programme to read the records of n employee */
import java.util.Scanner;
class employee
{
	int empId;
	String name;
	String work;
	int salary;
	double time;
	void disp()
	{
		System.out.println("\n\n\t Output");
		System.out.println("Employee ID : " +empId);
		System.out.println("Name : "+name);
		System.out.println("Work Name : "+work);
		System.out.println("Salary : "+salary);
		System.out.println("Time of Work : "+time);
	}
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Employee ID : ");
		empId = sc.nextInt();
		System.out.print("Enter Name : ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Enter Work Name : ");
		work = sc.nextLine();
		System.out.print("Salary : ");
		salary = sc.nextInt();
		System.out.print("Time of Work : ");
		time = sc.nextDouble();
		sc.close();
	}
}
public class EmployeeTest
{
	public static void main(String args[])
	{
		int b = 1;
		Scanner sc = new Scanner(System.in);
		employee e1 = new employee();
		System.out.print("Enter The No. of Employees : ");
		int a = sc.nextInt();
		while(b<=a)
		{
			e1.input();
			e1.disp();
			b++;
		}
		sc.close();
	}
}