/*  A Java Programme to Calculate Simple Interest Using Command Line */
class SimpleInterestCmd
{
	public static void main(String args[])
	{
		int p, r, t; 
		double si;
		p = Integer.parseInt(args[0]);
		r = Integer.parseInt(args[1]);
		t = Integer.parseInt(args[1]);
		si = (p*r*t)/100;
		System.out.println("Simple Interest = " +si);
	}
}
