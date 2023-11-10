/* A Java Programme to find the Distance Travelled by a Vhicle */
import java.util.Scanner;
class Distance
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double u, t=300, a, d, b;
		//time is given in seconds
		System.out.print("Enter The Value of 'u' : ");
		u = sc.nextDouble();
		System.out.print("Enter The value of 'a' : ");
		a = sc.nextDouble();
		System.out.println("Where 'u' is Initial Velocity and 'a' is Acceleration");
		d = u*t+(a*t*t)/2;
		System.out.println("Distance Travelled in 5 Minutes = "+d+" meters");
		b = d/1000;
		System.out.println("Distance Travelled in 5 Minutes = "+b+" kilo meters");
	}
}