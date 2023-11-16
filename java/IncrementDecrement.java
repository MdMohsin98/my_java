/** A Java Programme to define the Increment and Decrement Operator */
class IncrementDecrement
{
	public static void main(String args[])
	{
		int p = -37, q = 18, r = -17;
		System.out.println("Before Calculating the Values:\n P = "+p+", Q = "+q+" and R = "+r);
		q = p++ - --r + ++p;
		p = q-- + ++r - --q;
		r = r++ - --q + ++p;
		System.out.println("After Calculating the Values:\n P = "+p+", Q = "+q+" and R = "+r);
	}
}