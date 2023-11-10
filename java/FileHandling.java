/** File Handling */
import java.io.*;
class FileHandling 
{
	public static void main(String args[]) 
	{
 		File f = new File(args[0]);
 		System.out.println("File exists: "+f.exists());
 		System.out.println("File can be read:"+f.canRead());
 		System.out.println("File can be written: "+f.canWrite());
 		System.out.println("File can be executed:"+f.canExecute());
 		System.out.println("File name: "+f.getName());
 		System.out.println("Parent of File:"+f.getParent());
 		System.out.println("Path of the File:"+f.getPath());
 		System.out.println("Hidden File: "+f.isHidden());
 		System.out.println("Length of the file: "+f.length());
 		System.out.println("last modifi ed time: "+f.lastModified());
 		System.out.println("It is a File: "+f.isFile());
 		if(f.isDirectory()) 
		{
 			System.out.println(f.getPath()+ "is a irectory");
 			String l[] = f.list();
 			System.out.println("\nDirectory Listing for "+f.getPath() + "is:");
			for(String a:l) 
			{
				File f1 = new File(f.getPath() + "/" +a);
				if(f1.isDirectory()) 
				{
 					System.out.println(a+ "is a directory");
 					f1 = null;
				}
				else
 				{ 
					System.out.println(a+ "is a File");
					f1 = null;
				}
			}
		}
	}
}