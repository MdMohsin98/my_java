/** A Java Programme to Convert the Temperature in Fahrenheit 
	to Celsius */
import java.util.Scanner;
class ConvertTemp
{
	public static void main(String args[])
	{
		double f,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Temperature in Fahrenheit : ");
		f = sc.nextDouble();
		c = (f-32)/1.8;
		System.out.print("Temperature in Celsius is : "+c+" Celsius");
	}
}