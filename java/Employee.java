/** A Java Programme to read the records of n employee */
import java.util.Scanner;
class employee
{
	int empId;
	String name;
	String work;
	int salary;
	double time;
	/**employee()
	{
		empId = 1;
		name = "AAA";
		work = "BBB";
		salary = 8000;
		time = 8.00;
	}*/
	void disp()
	{
		System.out.println("Employee ID : " +empId);
		System.out.println("Name : "+name);
		System.out.println("Work : "+work);
		System.out.println("Salary : "+salary);
		System.out.println("Time of Work : "+time);
	}
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID : ");
		empId = sc.nextInt();
		System.out.println("Enter Name : ");
		//sc.next();
		name = sc.nextLine();
		System.out.println("Enter Work : ");
		work = sc.nextLine();
		System.out.println("Salary : ");
		salary = sc.nextInt();
		System.out.println("Time of Work : ");
		time = sc.nextDouble();
	}
}
public class Employee
{
	public static void main(String args[])
	{
		employee e1 = new employee();
		//e1.employee();
		e1.input();
		e1.disp();
	}
}

