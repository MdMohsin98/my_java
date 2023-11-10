/** A java Programme to copy the content of one file into another file using command line argument and read() and write() method */
import java.io.*;
class CopyFile
{
	public static void main(String args[])
	{
		int c;
		try
		{
			FileInputStream fin = new FileInputStream(args[0]);
			FileInputStream fout = new FileOutputStream(args[1]);
			while((c = fin.read())!= -1)
			{
				fout.write((char)c);
			}
			fin.close();
			fout.close();
		}
		catch(IOException e)
		{
			System.out.println("File I/O Error : " +e);
		}
		finally
		{
			System.out.println("Thanks ");
		}
	}
}