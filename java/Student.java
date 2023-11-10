class Student
{
	int rollNumber;
	void getNumber(int n)
	{
		rollNumber = n;
	}
	void putNumber()
	{
		System.out.println("Roll No : " +rollNumber);
	}
}
class Test extends Student
{
	float part1, part2;
	void getmarks(float m1, float m2)
	{
		part1 = m1;
		part2 = m2;
	}
	void putmarks()
	{
		System.out.println("Marks Obtained ");
		System.out.println("Part1 = " +part1);
		System.out.println("Part2 = " +part2);
	}
}
interface Sports
{
	float sportWt = 6.0F;
	void putWt();
}
class Results extends Test implements Sports
{
	float total;
	public void putWt()
	{
		System.out.println("Sports Wt = " +sportWt);
	}
	void display()
	{
		total = part1 + part2 + sportWt;
		putNumber();
		putMarks();
		putWt();
		System.out.println("Total Score = " +total);
	}
}
class Hybrid
{
	public static void main(String args[])
	{
		Results student1 = new Results();
		Student1.getNumber(1234);
		Student1.getMarks(27.5F, 33.0F);
		Student1.display();
	}
}