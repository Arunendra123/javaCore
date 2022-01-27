import java.io.*;

public class FileCopy 
{
	//This method has reusable code, so not handling exception.
	public static void copyFile(String srcFile, String destFile)throws FileNotFoundException, IOException
	{
			FileInputStream 		fis = new FileInputStream(srcFile);
			FileOutputStream	fos =  new FileOutputStream(destFile); 

			int i;
			while( ( i = fis.read() ) != -1)
			{
				fos.write(i);
			}

			System.out.println("Data has written");
	}
}
class Test
{
	public static void main(String[] args) 
	{
		//It is user application, so it must handled exceptions to print user understandable exception messages
		
		try
		{	
			FileCopy.copyFile(args[0], args[1]);
		}
		catch(ArrayIndexOutOfBoundsException aeiob)
		{
			System.out.println("Error: Please pass source and destination file names");
			System.out.println("Usage: java Test abc.txt bbc.txt");
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("Error: The given files "+ args[0] +" , " + args[1] + " are not found, make sure they are avilable in the current path");
		}
		catch(IOException ioe)
		{
			System.out.println("Error: Reading or writting failed");
			e.printStackTrace();
		}
	}
}
