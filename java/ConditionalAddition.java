/** A Java Programme to find the sum of all integers between 100 to 200 divisible by 7*/
class ConditionalAddition
{
	public static void main(String args[])
	{
		int a, b=0, c=0;
		for(a=100; a<=200; a++)
		if(a%7==0)
		b = b+a;
		System.out.println("The Sum of Nos. Are : "+b);
	}
}