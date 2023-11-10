/** A Java Programme to Check The Prime Nos. between 1 to 100 */
class Prime
{
	public static void main(String[] args)
	{
		int a,b;
		System.out.println("Prime numbers between 1 to 100 : ");
		for (a = 1; a < 100; a++)
		{
			for (b = 2; b < a; b++)
			{
				if(a % b == 0)break;
			}
			if(a == b) 
			{
				System.out.println("\t"+a);
			}
		}
	}
}